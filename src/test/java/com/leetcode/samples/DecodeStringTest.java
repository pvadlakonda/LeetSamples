package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeStringTest {

    private final DecodeString solution = new DecodeString();

    @Test
    void testBasicDecoding() {
        String input = "3[a]2[bc]";
        String expected = "aaabcbc";
        assertEquals(expected, solution.decodeString(input));
    }

    @Test
    void testNestedDecoding() {
        String input = "3[a2[c]]";
        String expected = "accaccacc";
        assertEquals(expected, solution.decodeString(input));
    }

    @Test
    void testMixedDecoding() {
        String input = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        assertEquals(expected, solution.decodeString(input));
    }
}