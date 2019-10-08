package com.leetcode.samples;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int max = 0;
        Map<String, Integer> palindromes = new HashMap<>();

        for (int i=0; i < s.length(); i++) {
            for(int j=i+1; j <= s.length(); j++) {

                String tmpString = s.substring(i, j);
                if (!palindromes.containsKey(tmpString) && isPalindrome(tmpString)) {
                    palindromes.put(tmpString, tmpString.length());
                    if (palindromes.get(tmpString) > max) {
                        longestPalindrome = tmpString;
                        max = palindromes.get(tmpString);
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String str) {

        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
