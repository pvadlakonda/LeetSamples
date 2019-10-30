package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RotateArrayTest {

    private RotateArray solution = new RotateArray();

    @Test
    void shouldRotate3Times() {

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, solution.rotate(input, 3));
    }

    @Test
    void shouldRotate2Times() {

        int[] input = new int[]{-1, -100, 3, 99};
        int[] expected = new int[]{3, 99, -1, -100};
        assertArrayEquals(expected, solution.rotate(input, 2));
    }

    @Test
    void shouldRotate0Times() {

        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, solution.rotate(input, 0));
    }


}