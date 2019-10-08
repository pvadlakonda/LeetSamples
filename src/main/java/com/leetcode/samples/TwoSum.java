package com.leetcode.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memos = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i];
            if (memos.containsKey(nums[i])) {
                result[0] = memos.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                memos.put(match, i);
            }

        }
        return result;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int i : nums1) {
            list1.add(i);
        }
        for(int i : nums2) {
            list1.add(i);
        }
        Collections.sort(list1);

        if (list1.size() % 2 == 1) {
            return list1.get(list1.size() / 2) ;
        } else {
            int half = list1.size() / 2;
            return (list1.get(half-1) + list1.get(half)) / 2.0;
        }



//        if(list1.size() == 1) {
//            return list1.get(0);
//        }
//        if(list1.size() == 2) {
//            return (list1.get(0) + list1.get(1)) / 2.0;
//        }
//        if(list1.size() == 3) {
//            return list1.get(1);
//        }
//
//        int middle = (list1.size()) / 2 ;
//        if (middle % 2 == 0) { //even
//            return (list1.get(middle-1) + list1.get(middle)) / 2.0;
//        } else {//odd
//            return list1.get(middle);
//        }
    }
}
