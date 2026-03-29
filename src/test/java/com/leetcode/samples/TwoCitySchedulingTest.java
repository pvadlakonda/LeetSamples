package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoCitySchedulingTest {

    private final TwoCityScheduling solution = new TwoCityScheduling();

    @Test
    void shouldReturn110ForFourPeople() {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertEquals(110, solution.twoCitySchedCost(costs));
    }

    @Test
    void shouldReturn1859ForSixPeople() {
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        assertEquals(1859, solution.twoCitySchedCost(costs));
    }

    @Test
    void shouldReturn3086ForEightPeople() {
        int[][] costs = {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};
        assertEquals(3086, solution.twoCitySchedCost(costs));
    }

    @Test
    void shouldReturn2ForMinimumInput() {
        int[][] costs = {{1, 2}, {2, 1}};
        assertEquals(2, solution.twoCitySchedCost(costs));
    }
}
