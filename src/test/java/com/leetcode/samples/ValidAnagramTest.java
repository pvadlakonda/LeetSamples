package com.leetcode.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void testValidAnagram() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(validAnagram.isAnagram2("anagram", "nagaram"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(validAnagram.isAnagram("rat", "car"));
        assertFalse(validAnagram.isAnagram2("rat", "car"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(validAnagram.isAnagram("abc", "ab"));
        assertFalse(validAnagram.isAnagram2("abc", "ab"));
    }

    @Test
    void testSingleCharSame() {
        assertTrue(validAnagram.isAnagram("a", "a"));
        assertTrue(validAnagram.isAnagram2("a", "a"));
    }

    @Test
    void testSingleCharDifferent() {
        assertFalse(validAnagram.isAnagram("a", "b"));
        assertFalse(validAnagram.isAnagram2("a", "b"));
    }

    @Test
    void testDuplicateChars() {
        assertTrue(validAnagram.isAnagram("aab", "baa"));
        assertTrue(validAnagram.isAnagram2("aab", "baa"));
    }

    @Test
    void testSameStringIsAnagram() {
        assertTrue(validAnagram.isAnagram("listen", "listen"));
        assertTrue(validAnagram.isAnagram2("listen", "listen"));
    }
}
