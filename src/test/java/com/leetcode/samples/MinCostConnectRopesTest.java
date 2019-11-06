package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinCostConnectRopesTest {

    private MinCostConnectRopes solution = new MinCostConnectRopes();

    @Test
    void shouldReturn58() {

        int[] ropes = new int[]{8, 4, 6, 12};

        assertEquals(58, solution.minCost(ropes));
    }

    @Test
    void shouldReturn54() {

        int[] ropes = new int[]{20, 4, 8, 2};

        assertEquals(54, solution.minCost(ropes));
    }

    @Test
    void shouldReturn224() {

        int[] ropes = new int[]{1, 2, 5, 10, 35, 89};

        assertEquals(224, solution.minCost(ropes));
    }

    @Test
    void shouldReturn20() {

        int[] ropes = new int[]{2, 2, 3, 3};

        assertEquals(20, solution.minCost(ropes));
    }
}