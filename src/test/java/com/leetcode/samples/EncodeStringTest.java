package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncodeStringTest {

    private EncodeString solution = new EncodeString();

    @Test
    void shouldEncodeConsecutiveCharacters() {
        assertEquals("a3b2c2d3", solution.encode("aaabbccddd"));
    }

    @Test
    void shouldEncodeAllSameCharacters() {
        assertEquals("a5", solution.encode("aaaaa"));
    }

    @Test
    void shouldEncodeAllUniqueCharacters() {
        assertEquals("a1b1c1", solution.encode("abc"));
    }

    @Test
    void shouldEncodeSingleCharacter() {
        assertEquals("a1", solution.encode("a"));
    }

    @Test
    void shouldReturnEmptyForEmptyInput() {
        assertEquals("", solution.encode(""));
    }

    @Test
    void shouldReturnEmptyForNullInput() {
        assertEquals("", solution.encode(null));
    }

    @Test
    void shouldHandleTwoCharacterGroups() {
        assertEquals("a2b2", solution.encode("aabb"));
    }
}
