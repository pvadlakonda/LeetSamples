package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestTest {

    private KthLargest solution = new KthLargest();

    @Test
    void shouldReturn5ForK2() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(5, solution.findKthLargestUsingMaxHeap(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void shouldReturn4ForK4() {
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        assertEquals(4, solution.findKthLargestUsingMaxHeap(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void shouldReturnOnlyElementForK1() {
        assertEquals(7, solution.findKthLargest(new int[]{7}, 1));
        assertEquals(7, solution.findKthLargestUsingMaxHeap(new int[]{7}, 1));
    }

    @Test
    void shouldReturnLargestForK1() {
        assertEquals(6, solution.findKthLargest(new int[]{1, 3, 6, 2}, 1));
        assertEquals(6, solution.findKthLargestUsingMaxHeap(new int[]{1, 3, 6, 2}, 1));
    }

    @Test
    void shouldHandleDuplicates() {
        assertEquals(5, solution.findKthLargest(new int[]{5, 5, 5}, 2));
        assertEquals(5, solution.findKthLargestUsingMaxHeap(new int[]{5, 5, 5}, 2));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(-1, solution.findKthLargest(new int[]{-1, -3, -2}, 1));
        assertEquals(-1, solution.findKthLargestUsingMaxHeap(new int[]{-1, -3, -2}, 1));
    }

    @Test
    void shouldReturnSmallestForKEqualsLength() {
        assertEquals(1, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6));
        assertEquals(1, solution.findKthLargestUsingMaxHeap(new int[]{3, 2, 1, 5, 6, 4}, 6));
    }
}
