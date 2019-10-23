package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GCDOfStringsTest {

    private GCDOfStrings solution = new GCDOfStrings();

    @Test
    void shouldReturnAB() {

        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    void shouldReturnABC() {

        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    void shouldReturnEmpty() {

        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void shouldReturnTAUXX() {

        assertEquals("TAUXX", solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}