package com.leetcode.samples;

import java.util.Arrays;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int i = nums.length / 2;
        return nums[i];
    }
}
