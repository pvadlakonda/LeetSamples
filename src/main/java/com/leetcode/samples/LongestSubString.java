package com.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int result=0, start = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                if (charMap.get(c) >= start) {
                    start = charMap.get(c) + 1;
                }
            }
            charMap.put(c, i);
            result = Math.max((i - start) + 1, result);
        }
        return result;
    }
}
