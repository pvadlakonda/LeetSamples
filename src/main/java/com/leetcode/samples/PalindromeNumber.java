package com.leetcode.samples;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 */

public class PalindromeNumber {

    public boolean isPalindrome(int input) {

        if (input < 0 || (input % 10 == 0 && input != 0)) {
            return false;
        }
        int reverse = 0;

        while (input > reverse) {
            reverse = (reverse * 10) + input % 10;
            input = input / 10;
        }

        return (input == reverse) || (input == reverse / 10);
    }
}
