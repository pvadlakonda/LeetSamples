package com.leetcode.samples;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
    Note that the same word in the dictionary may be reused multiple times in the segmentation.

    Example 1:
    Input: s = "leetcode", wordDict = ["leet","code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".

    Example 2:
    Input: s = "applepenapple", wordDict = ["apple","pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    Note that you are allowed to reuse a dictionary word.

    Example 3:
    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: false

    Constraints:
    1 <= s.length <= 300
    1 <= wordDict.length <= 1000
    1 <= wordDict[i].length <= 20
    s and wordDict[i] consist of only lowercase English letters.
    All the strings of wordDict are unique.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        // Convert word dictionary to set for O(1) lookup
        Set<String> wordSet = new HashSet<>(wordDict);

        int strLength = s.length();
        // dp[i] is true if s[0...i-1] can be segmented
        boolean[] dp = new boolean[strLength + 1];
        // base case - empty string is valid
        dp[0] = true;

        for (int i = 1; i <= strLength; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[strLength];
    }
}
