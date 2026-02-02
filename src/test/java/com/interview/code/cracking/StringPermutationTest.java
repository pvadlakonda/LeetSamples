package com.interview.code.cracking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringPermutationTest {

    private final StringPermutation solution = new StringPermutation();

    @Test
    void shouldReturnTrueForAbcAndAcb() {

        assertTrue(solution.containsPermutaion("abc", "acb"));
    }

    @Test
    void shouldReturnFalseForAbcAndAcd() {

        assertFalse(solution.containsPermutaion("abc", "acd"));
    }

    @Test
    void shouldReturnFalseForAbcAndAcc() {

        assertFalse(solution.containsPermutaion("abc", "acc"));
    }

    @Test
    void shouldReturnFalseForAbcAndAbcWithSpace() {

        assertFalse(solution.containsPermutaion("abc", "abc "));
    }
}