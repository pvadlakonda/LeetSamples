package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void testSinglePair() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("[]"));
        assertTrue(solution.isValid("{}"));
    }

    @Test
    void testMultiplePairs() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void testNestedValid() {
        assertTrue(solution.isValid("([])"));
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    void testMismatchedBrackets() {
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    void testUnclosedBracket() {
        assertFalse(solution.isValid("("));
        assertFalse(solution.isValid("([]"));
    }

    @Test
    void testExtraClosingBracket() {
        assertFalse(solution.isValid(")"));
        assertFalse(solution.isValid("())"));
    }

    @Test
    void testEmptyString() {
        assertTrue(solution.isValid(""));
    }
}
