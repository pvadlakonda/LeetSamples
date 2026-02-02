package com.interview.code.cracking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringPermutationTest {

    private final StringPermutation solution = new StringPermutation();

    @Test
    void shouldReturnTrueForAbcAndAcb() {

        assertTrue(solution.containsPermutation("abc", "acb"));
    }

    @Test
    void shouldReturnFalseForAbcAndAcd() {

        assertFalse(solution.containsPermutation("abc", "acd"));
    }

    @Test
    void shouldReturnFalseForAbcAndAcc() {

        assertFalse(solution.containsPermutation("abc", "acc"));
    }

    @Test
    void shouldReturnFalseForAbcAndAbcWithSpace() {

        assertFalse(solution.containsPermutation("abc", "abc "));
    }
}