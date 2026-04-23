package com.interview.code.cracking;

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
        assertEquals("a2b1c5a3", stringCompression.compressedString("aabcccccaaa"));
    }

    @Test
    void testAllUniqueChars() {
        assertEquals("abcdef", stringCompression.compressedString("abcdef"));
    }

    @Test
    void testAllSameChars() {
        assertEquals("a5", stringCompression.compressedString("aaaaa"));
    }

    @Test
    void testSingleChar() {
        assertEquals("a", stringCompression.compressedString("a"));
    }

    @Test
    void testTwoSameChars() {
        assertEquals("a2", stringCompression.compressedString("aa"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", stringCompression.compressedString(""));
    }

    @Test
    void testNullString() {
        assertEquals("", stringCompression.compressedString(null));
    }
}
