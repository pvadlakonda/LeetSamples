package com.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

/*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true

    Example 2:
    Input: s = "rat", t = "car"
    Output: false

    Constraints:
    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //each char and their count
        Map<Character, Integer> inputStrChars = new HashMap<>();
        Map<Character, Integer> targetStrChars = new HashMap<>();

        for (char c : s.toCharArray()) {
            inputStrChars.put(c, inputStrChars.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            targetStrChars.put(c, targetStrChars.getOrDefault(c, 0) + 1);
        }

        for (char c : inputStrChars.keySet()) {
            if (!inputStrChars.get(c).equals(targetStrChars.get(c))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
