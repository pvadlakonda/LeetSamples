package com.leetcode.samples;

public class RotateArray {

    public int[] rotate(int[] nums, int k) {

        while (k != 0) {
            int lastNum = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];

            }
            nums[0] = lastNum;
            k--;
        }

        return nums;
    }
}
