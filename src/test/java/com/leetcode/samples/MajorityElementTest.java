package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

    private MajorityElement solution = new MajorityElement();

    @Test
    void shouldReturn3For332() {
        int[] nums = new int[]{3, 3, 2};

        assertEquals(3, solution.majorityElement(nums));
    }

    @Test
    void shouldReturn2() {
        int[] nums = new int[]{2,2,1,1,1,2,2};

        assertEquals(2, solution.majorityElement(nums));
    }

    @Test
    void shouldReturn1() {
        int[] nums = new int[]{1};

        assertEquals(1, solution.majorityElement(nums));
    }
}