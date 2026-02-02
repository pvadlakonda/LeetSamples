package com.leetcode.samples;

/**
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
 * <p>
 * Return the largest string X such that X divides str1 and X divides str2.
 */

public class GCDOfStrings {

    public String gcdOfStrings(String str1, String str2) {

        String result = str1.length() < str2.length() ? str1 : str2;

        while (!result.isEmpty()) {
            if (isDivisible(str1, result) && isDivisible(str2, result)) {
                return result;
            } else {
                result = result.substring(0, result.length() - 1);
            }
        }

        return "";
    }

    private boolean isDivisible(String str1, String result) {
        if (str1.equals(result)) {
            return true;
        }

        try {
            while (!str1.isEmpty()) {
                if (str1.startsWith(result)) {
                    str1 = str1.substring(result.length());
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
