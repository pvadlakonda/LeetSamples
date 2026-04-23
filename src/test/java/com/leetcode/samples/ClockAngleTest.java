package com.leetcode.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockAngleTest {

    private ClockAngle clockAngle;
    private static final double DELTA = 1e-5;

    @BeforeEach
    void setUp() {
        clockAngle = new ClockAngle();
    }

    @Test
    void testHour12Minutes30() {
        assertEquals(165.0, clockAngle.angleClock(12, 30), DELTA);
    }

    @Test
    void testHour3Minutes30() {
        assertEquals(75.0, clockAngle.angleClock(3, 30), DELTA);
    }

    @Test
    void testHour3Minutes15() {
        assertEquals(7.5, clockAngle.angleClock(3, 15), DELTA);
    }

    @Test
    void testHour4Minutes50() {
        assertEquals(155.0, clockAngle.angleClock(4, 50), DELTA);
    }

    @Test
    void testHour12Minutes0() {
        assertEquals(0.0, clockAngle.angleClock(12, 0), DELTA);
    }

    @Test
    void testHour6Minutes0() {
        assertEquals(180.0, clockAngle.angleClock(6, 0), DELTA);
    }

    @Test
    void testHour9Minutes0() {
        assertEquals(90.0, clockAngle.angleClock(9, 0), DELTA);
    }
}
