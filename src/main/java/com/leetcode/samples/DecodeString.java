package com.leetcode.samples;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * <p>
 * Examples:
 * <p>
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */
public class DecodeString {

    public String decodeString(String s) {// 3[a]2[bc]  3[a2[c]]

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == '[') {
                stack.push(i);
            }
        }

        return result.toString();
    }

}
