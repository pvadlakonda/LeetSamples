package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInStringTest {

    private FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString();

    @Test
    void shouldReturn0() {

        assertEquals(0, solution.firstUniqChar("leetcode"));
    }

    @Test
    void shouldReturnMinus1() {

        assertEquals(-1, solution.firstUniqChar("aaa"));
    }

    @Test
    void shouldReturn2() {

        assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }
}