package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    private PalindromeNumber solution = new PalindromeNumber();

    @Test
    void shouldReturnTrueFor121() {

        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void shouldReturnFalseForMinue121() {

        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void shouldReturnTrueFor0() {

        assertTrue(solution.isPalindrome(0));
    }

    @Test
    void shouldReturnFalseForMinue124() {

        assertFalse(solution.isPalindrome(-124));
    }

    @Test
    void shouldReturnTrueFor5445() {

        assertTrue(solution.isPalindrome(5445));
    }

    @Test
    void shouldReturnFalseFor10() {

        assertFalse(solution.isPalindrome(10));
    }
}