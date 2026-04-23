package com.leetcode.samples;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // 1. Sort the array alphabetically
        Arrays.sort(strs);

        // 2. Only compare the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // 3. Find the common characters between them
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        // 4. Return the matching substring
        return first.substring(0, i);
    }
}
