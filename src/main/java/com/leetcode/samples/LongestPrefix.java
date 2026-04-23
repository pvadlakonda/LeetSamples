package com.leetcode.samples;

/*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters if it is non-empty.

 */
public class LongestPrefix {
    public String longestCommonPrefix(String[] words) {

        // Step 1: Handle edge cases for empty or null arrays
        if (words == null || words.length == 0) {
            return "";
        }

        // Step 2: Iterate through each character of the first string
        for (int i = 0; i < words[0].length(); i++) {
            char currentChar = words[0].charAt(i);

            // Step 3: Compare this character with the same index in all other strings
            for (int j = 1; j < words.length; j++) {
                // If the current string is shorter than i or characters don't match, return result
                if (i == words[j].length() || words[j].charAt(i) != currentChar) {
                    return words[0].substring(0, i);
                }
            }
        }

        // Step 4: If the loops finish, the entire first string is the common prefix
        return words[0];
    }
}
