package com.leetcode.samples;

import java.util.Arrays;

public class UniqueArray {
    public static void makeUnique(int[] nums) {
        // Step 1: Sort the array to group duplicates together
        Arrays.sort(nums);

        // Step 2: Traverse and modify duplicates in place
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not greater than the previous one,
            // it is a duplicate or has been surpassed by a previous increment.
            if (nums[i] <= nums[i - 1]) {
                nums[i] = nums[i - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 14, 8, 14, 8, 7};
        makeUnique(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5, 7]
    }
}

