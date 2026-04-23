package com.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

/*
    Input: words = ["a", "app", "ap"], word = "app"
    Output: 2
    Explanation: "app" is a prefix of "app" and "application", so the score is 2.

    Input: words = ["a", "ab", "abc", "cab"], word = "abc"
    Output: 2
    Explanation: "abc" is a prefix of "abc" and "abcd", so the score is 2.

 */

public class PrefixMatch {

    public List<String> findWordsWithPrefix(String[] words, String prefix) {

        /*
            For each word, check if it starts with the given prefix
            Time Complexity: O(M * N) where M is the number of words and N is the average length of the prefix
            Space Complexity: O(K) where K is the number of matching words
            Note: We could use word.startsWith(prefix) for a cleaner implementation
            but let's implement it manually for learning purposes.
         */
        List<String> results = new ArrayList<>();
        for (String word : words) {
            // 1. Manually check length first
            if (word.length() >= prefix.length()) {
                boolean match = true;

                // 2. Loop through each character of the prefix
                for (int i = 0; i < prefix.length(); i++) {
                    // 3. Compare characters at the same index
                    if (word.charAt(i) != prefix.charAt(i)) {
                        match = false;
                        break; // Stop checking this string if a character doesn't match
                    }
                }

                if (match) {
                    results.add(word);
                }
            }
        }

        return results;
    }
}
