package com.leetcode.samples;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> mmajorityMap = new HashMap<>();

        for (int num : nums) {
            if (mmajorityMap.containsKey(num)) {
                mmajorityMap.put(num, mmajorityMap.get(num) + 1);
                if(mmajorityMap.get(num) > nums.length/2) {
                    return num;
                }
            } else {
                mmajorityMap.put(num, 1);
            }
        }

        return 0;
    }
}
