package com.interviews;

import java.util.HashSet;
import java.util.Set;

/*
    {3, 14, 8, 14, 8, 7} should return {3, 14, 8, 1, 2, 7}
    where the duplicates are replaced with smallest positive number
 */

/*
    Time Complexity: O(n), where n is the length of the input array.
    Space Complexity: O(n), for the hash sets storing seen and first occurrence information.

 */
public class UniqueSmallest {
    public int[] makeUniqueSmallest(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        // First pass: Mark all unique numbers currently in the array
        for (int num : nums) {
            seen.add(num);
        }

        // To track duplicates, we need to know if we've seen a number *in this pass*
        Set<Integer> firstOccurrence = new HashSet<>();
        int nextSmallest = 1;

        for (int i = 0; i < nums.length; i++) {
            if (!firstOccurrence.contains(nums[i])) {
                // Keep the first time we see a number
                firstOccurrence.add(nums[i]);
            } else {
                // If it's a duplicate, find the smallest positive integer not in 'seen'
                while (seen.contains(nextSmallest)) {
                    nextSmallest++;
                }
                nums[i] = nextSmallest;
                seen.add(nextSmallest); // Mark this new number as used
            }
        }

        return nums;
    }
}