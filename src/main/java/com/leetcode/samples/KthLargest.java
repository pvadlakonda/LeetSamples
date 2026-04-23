package com.leetcode.samples;

import java.util.Collections;
import java.util.PriorityQueue;

/*
    Given an integer array nums and an integer k, return the kth largest element in the array.
    Note that it is the kth largest element in the sorted order, not the kth distinct element.
    Can you solve it without sorting?

    Example 1:
    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5

    Example 2:
    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4

    Constraints:
    1 <= k <= nums.length <= 105
    -104 <= nums[i] <= 104
 */
public class KthLargest {
    /*
        Approach: Using a Min-Heap of Size K
        Time Complexity: O(N log K), where N is the number of elements.
        Space Complexity: O(K) for the heap.
     */
    public int findKthLargest(int[] nums, int k) {
        /*
            This approach has a time complexity of (O(N log K)),
            which is better than sorting the whole array ((O(N log N))) when (K) is small.
         */

        if (nums == null || nums.length == 0 || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Min-heap: the smallest of the K elements stays at the head
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The head of the heap is the Kth largest element
        return minHeap.peek();
    }

    /*
        Alternative approach using Max-Heap
        Time Complexity: O(N + K log N), where N is the number of elements.
        Space Complexity: O(N) for the heap.
     */
    public int findKthLargestUsingMaxHeap(int[] nums, int k) {
        // Create a max-heap using Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // 1. Add all elements to the heap
        for (int num : nums) {
            maxHeap.add(num);
        }

        // 2. Remove the top element k-1 times
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        // 3. The current top is the kth largest
        return maxHeap.peek();
    }
}
