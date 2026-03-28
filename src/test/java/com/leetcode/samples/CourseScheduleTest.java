package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {
    private final CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    void shouldReturnTrueWhenNoCycles() {
        int[][] prerequisites = {{1, 0}};
        assertTrue(courseSchedule.canFinish(2, prerequisites));
    }

    @Test
    void shouldReturnFalseWhenCycleExists() {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(courseSchedule.canFinish(2, prerequisites));
    }

    @Test
    void shouldReturnTrueWhenNoPrerequisites() {
        int[][] prerequisites = {};
        assertTrue(courseSchedule.canFinish(3, prerequisites));
    }

    @Test
    void shouldReturnTrueForLinearChain() {
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};
        assertTrue(courseSchedule.canFinish(4, prerequisites));
    }

    @Test
    void shouldReturnFalseForLongCycle() {
        int[][] prerequisites = {{1, 0}, {2, 1}, {0, 2}};
        assertFalse(courseSchedule.canFinish(3, prerequisites));
    }

    @Test
    void shouldReturnTrueForSingleCourse() {
        int[][] prerequisites = {};
        assertTrue(courseSchedule.canFinish(1, prerequisites));
    }

    @Test
    void shouldReturnTrueForMultipleIndependentCourses() {
        int[][] prerequisites = {{1, 0}, {3, 2}};
        assertTrue(courseSchedule.canFinish(4, prerequisites));
    }
}
