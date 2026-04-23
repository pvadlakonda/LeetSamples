package com.leetcode.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionTest {

    private StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    void testBasicCompression() {
        // "aabbccc" -> "a2b2c3", length 6
        assertEquals(6, stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    void testSingleChar() {
        // "a" -> "a", length 1
        assertEquals(1, stringCompression.compress(new char[]{'a'}));
    }

    @Test
    void testLargeGroup() {
        // "a" + "bbbbbbbbbbbb" -> "ab12", length 4
        assertEquals(4, stringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }

    @Test
    void testAllUniqueChars() {
        // "abcd" -> "abcd", length 4
        assertEquals(4, stringCompression.compress(new char[]{'a', 'b', 'c', 'd'}));
    }

    @Test
    void testAllSameChars() {
        // "aaaaa" -> "a5", length 2
        assertEquals(2, stringCompression.compress(new char[]{'a', 'a', 'a', 'a', 'a'}));
    }

    @Test
    void testTwoSameChars() {
        // "aa" -> "a2", length 2
        assertEquals(2, stringCompression.compress(new char[]{'a', 'a'}));
    }
}
