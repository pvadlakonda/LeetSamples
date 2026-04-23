package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInStringTest {

    private FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString();

    @Test
    void shouldReturn0() {

        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(0, solution.firstUniqChar2("leetcode"));
        assertEquals(0, solution.firstUniqChar3("leetcode"));
    }

    @Test
    void shouldReturnMinus1() {

        assertEquals(-1, solution.firstUniqChar("aaa"));
        assertEquals(-1, solution.firstUniqChar2("aaa"));
        assertEquals(-1, solution.firstUniqChar3("aaa"));
    }

    @Test
    void shouldReturn2() {

        assertEquals(2, solution.firstUniqChar("loveleetcode"));
        assertEquals(2, solution.firstUniqChar2("loveleetcode"));
        assertEquals(2, solution.firstUniqChar3("loveleetcode"));
    }
}