package com.leetcode.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WordBreakTest {

    private WordBreak wordBreak;

    @BeforeEach
    void setUp() {
        wordBreak = new WordBreak();
    }

    @Test
    void testLeetcode() {
        assertTrue(wordBreak.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    void testApplePenApple() {
        assertTrue(wordBreak.wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    void testCatsandog() {
        assertFalse(wordBreak.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    void testWordReusedMultipleTimes() {
        assertTrue(wordBreak.wordBreak("aaaaaa", List.of("a", "aa", "aaa")));
    }

    @Test
    void testNoMatchInDict() {
        assertFalse(wordBreak.wordBreak("hello", List.of("world", "foo")));
    }

    @Test
    void testSingleWordMatch() {
        assertTrue(wordBreak.wordBreak("dog", List.of("dog", "cat")));
    }

    @Test
    void testPartialMatchOnly() {
        assertFalse(wordBreak.wordBreak("cars", List.of("car", "ca")));
    }
}
