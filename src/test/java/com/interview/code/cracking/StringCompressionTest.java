package com.interview.code.cracking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCompressionTest {

    private final StringCompression solution = new StringCompression();

    @Test
    void shouldReturna2b2c2a3Foraabbccaaa() {

        assertEquals("a2b2c2a3", solution.compressedString("aabbccaaa"));
    }

    @Test
    void shouldReturnabcForabc() {

        assertEquals("abc", solution.compressedString("abc"));
    }
}