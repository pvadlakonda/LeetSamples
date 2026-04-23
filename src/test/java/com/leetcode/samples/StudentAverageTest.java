package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentAverageTest {

    @Test
    void shouldReturnJessicasAverage() {
        String[][] marks = {{"Bob","87"}, {"Mike","35"}, {"Bob","52"}, {"Jason","35"}, {"Mike","55"}, {"Jessica","99"}};
        assertEquals(99, StudentAverage.findHighestAverage(marks));
    }

    @Test
    void shouldReturnFlooredAverage() {
        String[][] marks = {{"Alice","90"}, {"Alice","91"}};
        assertEquals(90, StudentAverage.findHighestAverage(marks));
    }

    @Test
    void shouldHandleSingleStudent() {
        String[][] marks = {{"Alice","75"}};
        assertEquals(75, StudentAverage.findHighestAverage(marks));
    }

    @Test
    void shouldHandleTiedAverages() {
        String[][] marks = {{"Alice","80"}, {"Bob","80"}};
        assertEquals(80, StudentAverage.findHighestAverage(marks));
    }

    @Test
    void shouldReturnZeroForZeroScore() {
        String[][] marks = {{"Alice","0"}};
        assertEquals(0, StudentAverage.findHighestAverage(marks));
    }
}
