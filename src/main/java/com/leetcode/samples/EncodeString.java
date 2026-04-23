package com.leetcode.samples;

/*
 Convert "aaabbccddd" to "a3b2c2d3"
 */
public class EncodeString {
    /*
    Time Complexity: O(n)
    Space Complexity: O(n)
     */

    public String encode(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append char and its count, then reset
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return result.toString();
    }
}
