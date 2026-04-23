package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class PrefixMatchTest {

    private PrefixMatch solution = new PrefixMatch();

    @Test
    void shouldMatchWordsStartingWithApp() {
        String[] words = {"a", "app", "ap"};
        assertEquals(List.of("app"), solution.findWordsWithPrefix(words, "app"));
    }

    @Test
    void shouldMatchWordsStartingWithAbc() {
        String[] words = {"a", "ab", "abc", "cab"};
        assertEquals(List.of("ab", "abc"), solution.findWordsWithPrefix(words, "ab"));
    }

    @Test
    void shouldReturnAllWordsWhenPrefixIsSingleChar() {
        String[] words = {"apple", "apricot", "banana"};
        assertEquals(List.of("apple", "apricot"), solution.findWordsWithPrefix(words, "a"));
    }

    @Test
    void shouldReturnEmptyWhenNoPrefixMatch() {
        String[] words = {"cat", "dog", "bird"};
        assertTrue(solution.findWordsWithPrefix(words, "xyz").isEmpty());
    }

    @Test
    void shouldMatchExactWord() {
        String[] words = {"abc", "abcd", "xyz"};
        assertEquals(List.of("abc", "abcd"), solution.findWordsWithPrefix(words, "abc"));
    }

    @Test
    void shouldReturnEmptyForEmptyWordsArray() {
        assertTrue(solution.findWordsWithPrefix(new String[]{}, "abc").isEmpty());
    }

    @Test
    void shouldReturnAllWordsWhenPrefixIsEmpty() {
        String[] words = {"a", "ab", "abc"};
        assertEquals(List.of("a", "ab", "abc"), solution.findWordsWithPrefix(words, ""));
    }

    @Test
    void shouldNotMatchWordShorterThanPrefix() {
        String[] words = {"ab", "a", "abcde"};
        assertEquals(List.of("abcde"), solution.findWordsWithPrefix(words, "abcd"));
    }
}
