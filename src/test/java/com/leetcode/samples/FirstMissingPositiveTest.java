package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstMissingPositiveTest {

    private final FirstMissingPositive solution = new FirstMissingPositive();

    @Test
    void testMissingAfterConsecutive() {
        assertEquals(3, solution.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    void testMissingInMiddle() {
        assertEquals(2, solution.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    void testMissingOne() {
        assertEquals(1, solution.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    @Test
    void testAllNegatives() {
        assertEquals(1, solution.firstMissingPositive(new int[]{-1, -2, -3}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solution.firstMissingPositive(new int[]{2}));
        assertEquals(2, solution.firstMissingPositive(new int[]{1}));
    }

    @Test
    void testDuplicates() {
        assertEquals(2, solution.firstMissingPositive(new int[]{1, 1, 1}));
    }

    @Test
    void testConsecutiveFromOne() {
        // All of 1..n present, should return n+1
        assertEquals(4, solution.firstMissingPositive(new int[]{1, 2, 3}));
    }
}
