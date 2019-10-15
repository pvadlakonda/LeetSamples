package com.interview.code.cracking;

import java.util.Arrays;

public class StringPermutation {

    public boolean containsPermutaion(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equalsIgnoreCase(sort(str2));
    }

    private String sort(String str1) {
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
