package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.leetcode.samples.TwoSum;

class TwoSumTest {
    private TwoSum twoSum = new TwoSum();

    @Test
    void shouldReturn0And1() {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums, 9);

        int[] expected = {0, 1};

        for (int i = 0; i < result.length; i++) {
            assertTrue(contains(expected, result[i]));
        }
    }

    @Test
    void shouldReturn2And3() {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(nums, 26);

        int[] expected = {2, 3};

        for (int i = 0; i < result.length; i++) {
            assertTrue(contains(expected, result[i]));
        }
    }

    private boolean contains(int[] expected, int target) {
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] == target) {
                return true;
            }
        }
        return false;
    }
}