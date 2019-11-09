package com.leetcode.samples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumSortedArrayTest {

    private TwoSumSortedArray solution = new TwoSumSortedArray();

    @Test
    void test1() {
        int[] input = new int[]{5, 25, 75};
        Assertions.assertArrayEquals(new int[]{2, 3}, solution.twoSum(input, 100));
    }

    @Test
    void test2() {
        int[] input = new int[]{2,7,11,15};
        Assertions.assertArrayEquals(new int[]{1, 2}, solution.twoSum(input, 9));
    }
}