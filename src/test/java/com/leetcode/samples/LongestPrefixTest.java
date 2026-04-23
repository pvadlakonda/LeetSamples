package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPrefixTest {

    private LongestPrefix solution = new LongestPrefix();

    @Test
    void shouldReturnFlForFlowerFlowFlight() {
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void shouldReturnEmptyWhenNoCommonPrefix() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void shouldReturnWordWhenAllWordsAreSame() {
        assertEquals("abc", solution.longestCommonPrefix(new String[]{"abc", "abc", "abc"}));
    }

    @Test
    void shouldReturnSingleWordForOneElementArray() {
        assertEquals("alone", solution.longestCommonPrefix(new String[]{"alone"}));
    }

    @Test
    void shouldReturnEmptyWhenOneWordIsEmpty() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"abc", "", "abcd"}));
    }

    @Test
    void shouldReturnEmptyForNullInput() {
        assertEquals("", solution.longestCommonPrefix(null));
    }

    @Test
    void shouldReturnEmptyForEmptyArray() {
        assertEquals("", solution.longestCommonPrefix(new String[]{}));
    }

    @Test
    void shouldReturnFullWordWhenOneIsSubstringOfOthers() {
        assertEquals("ab", solution.longestCommonPrefix(new String[]{"ab", "abc", "abcd"}));
    }

    @Test
    void shouldReturnSingleCharPrefix() {
        assertEquals("a", solution.longestCommonPrefix(new String[]{"apple", "ape", "ant"}));
    }
}
