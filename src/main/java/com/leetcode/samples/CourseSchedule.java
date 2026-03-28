package com.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

/*
    There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

    For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
    Return true if you can finish all courses. Otherwise, return false.

    Example 1:

    Input: numCourses = 2, prerequisites = [[1,0]]
    Output: true
    Explanation: There are a total of 2 courses to take.
    To take course 1 you should have finished course 0. So it is possible.
    Example 2:

    Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
    Output: false
    Explanation: There are a total of 2 courses to take.
    To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.


    Constraints:

    1 <= numCourses <= 2000
    0 <= prerequisites.length <= 5000
    prerequisites[i].length == 2
    0 <= ai, bi < numCourses
    All the pairs prerequisites[i] are unique.
 */

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0 || prerequisites.length == 1) {
            return true;
        }

        List<Course> allCourses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            allCourses.add(new Course());
        }

        for (int[] pair : prerequisites) {
            Course tmpCourse = allCourses.get(pair[0]);
            tmpCourse.addPrerequisite(allCourses.get(pair[1]));
        }

        for (Course allCourse : allCourses) {
            finishCourse(allCourse);
        }
        for (Course course : allCourses) {
            if (!course.finished) {
                return false;
            }
        }

        return true;
    }

    private void finishCourse(Course course) {
        course.visited = true;
        if (course.finished) {
            return;
        }
        for (Course prerequisite : course.prerequisites) {
            if (prerequisite.finished) {
                continue;
            }
            if (!prerequisite.visited) {
                finishCourse(prerequisite);
            }
            if (!prerequisite.finished) {
                return;
            }
        }
        course.finished = true;
    }

    static class Course {
        private boolean visited = false;
        private boolean finished = false;
        private final List<Course> prerequisites = new ArrayList<>();

        public void addPrerequisite(Course prerequisite) {
            prerequisites.add(prerequisite);
        }
    }
}
