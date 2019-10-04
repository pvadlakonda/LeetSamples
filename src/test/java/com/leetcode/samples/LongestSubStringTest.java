package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubStringTest {

    private LongestSubString solution = new LongestSubString();

    @Test
    void shouldReturn3Forpwwkew() {

        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void shouldReturn3Forabcabcbb() {

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }


    @Test
    void shouldReturn3Forbbbb() {

        assertEquals(1, solution.lengthOfLongestSubstring("bbbb"));
    }

    @Test
    void shouldReturn1ForSpace() {

        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

    @Test
    void shouldReturn0ForEmptyString() {

        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void shouldReturn2Forau() {

        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }

    @Test
    void shouldReturn2Fordvdf() {

        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }
}