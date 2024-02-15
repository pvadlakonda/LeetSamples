package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    void testSimple() {
        String result = reverseString.reverseString("hello");

        assertEquals("olleh", result);
    }

    @Test
    void test2() {
        String result = reverseString.reverseString("malayalam");

        assertEquals("malayalam", result);
    }

    @Test
    void test3() {
        String result = reverseString.reverseString("h");

        assertEquals("h", result);
    }

    @Test
    void test4() {
        String result = reverseString.reverseString("23");

        assertEquals("32", result);
    }

    @Test
    void test5() {
        String result = reverseString.reverseString("");

        assertEquals("", result);
    }
}