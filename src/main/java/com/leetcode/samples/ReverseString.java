package com.leetcode.samples;

public class ReverseString {
    public String reverseString(String input) {
        char[] stringChars = input.toCharArray();
        int left = 0;
        int right = stringChars.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = stringChars[left];
            stringChars[left] = stringChars[right];
            stringChars[right] = temp;

            // Move pointers towards each other
            left++;
            right--;
        }
        return new String(stringChars);
    }
}
