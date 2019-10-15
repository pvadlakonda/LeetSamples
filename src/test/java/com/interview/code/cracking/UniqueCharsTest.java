package com.interview.code.cracking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueCharsTest {
    private UniqueChars solution = new UniqueChars();

    @Test
    void shouldReturnTrueForABC() {

        assertTrue(solution.hasUniqueChars("abc"));
    }

    @Test
    void shouldReturnTrueForABCA() {

        assertFalse(solution.hasUniqueChars("abca"));
    }
}