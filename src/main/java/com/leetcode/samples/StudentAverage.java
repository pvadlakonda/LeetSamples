package com.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

/*
    Given a 2-D String array of student-marks find the student with the highest average and output his average score. If the average is in decimals, floor it down to the nearest integer.
    Example 1:Input: [{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}]
    Output: 99
    Explanation: Since Jessica's average is greater than Bob's, Mike's and Jason's average.
 */
public class StudentAverage {
    /*
    Time Complexity: O(n)
    Space Complexity: O(n)
     */
    public static int findHighestAverage(String[][] marks) {
        Map<String, Student> studentMap = new HashMap<>();

        // 1. Process data into Student objects
        for (String[] entry : marks) {
            String name = entry[0];
            int score = Integer.parseInt(entry[1]);

            // If student doesn't exist in map, create a new one
            if (!studentMap.containsKey(name)) {
                studentMap.put(name, new Student(name));
            }
            studentMap.get(name).addScore(score);
        }

        // 2. Find the highest average
        int maxAverage = Integer.MIN_VALUE;
        for (Student s : studentMap.values()) {
            int currentAverage = s.getAverage();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }

        return maxAverage;
    }
}

class Student {
    String name;
    int totalScore = 0;
    int count = 0;

    Student(String name) {
        this.name = name;
    }

    void addScore(int score) {
        this.totalScore += score;
        this.count++;
    }

    int getAverage() {
        if (count == 0) return 0;
        // Using Math.floor on double to ensure we round down correctly
        return (int) Math.floor((double) totalScore / count);
    }
}
