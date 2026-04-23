package com.leetcode.samples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NthElementFromEndLinkedListTest {

    private NthElementFromEndLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new NthElementFromEndLinkedList();
    }

    private Node buildList(int... values) {
        Node dummy = new Node(0);
        Node curr = dummy;
        for (int v : values) {
            curr.next = new Node(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private int[] toArray(Node head) {
        int size = 0;
        Node curr = head;
        while (curr != null) { curr = curr.next; size++; }
        int[] arr = new int[size];
        curr = head;
        for (int i = 0; i < size; i++) { arr[i] = curr.data; curr = curr.next; }
        return arr;
    }

    @Test
    void testRemoveMiddleNode() {
        // [1,2,3,4,5], n=2 -> [1,2,3,5]
        Node result = solution.removeNthFromEnd(buildList(1, 2, 3, 4, 5), 2);
        assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(result));
    }

    @Test
    void testRemoveLastNode() {
        // [1,2], n=1 -> [1]
        Node result = solution.removeNthFromEnd(buildList(1, 2), 1);
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    void testRemoveFirstNode() {
        // [1,2], n=2 -> [2]
        Node result = solution.removeNthFromEnd(buildList(1, 2), 2);
        assertArrayEquals(new int[]{2}, toArray(result));
    }

    @Test
    void testSingleNode() {
        // [1], n=1 -> []
        Node result = solution.removeNthFromEnd(buildList(1), 1);
        assertNull(result);
    }

    @Test
    void testRemoveHeadFromLongerList() {
        // [1,2,3,4,5], n=5 -> [2,3,4,5]
        Node result = solution.removeNthFromEnd(buildList(1, 2, 3, 4, 5), 5);
        assertArrayEquals(new int[]{2, 3, 4, 5}, toArray(result));
    }

    @Test
    void testRemoveTailFromLongerList() {
        // [1,2,3,4,5], n=1 -> [1,2,3,4]
        Node result = solution.removeNthFromEnd(buildList(1, 2, 3, 4, 5), 1);
        assertArrayEquals(new int[]{1, 2, 3, 4}, toArray(result));
    }

    @Test
    void testRemoveFromUnsortedList() {
        // [1, 5, 8, 6, 15], n=3 -> [1, 5, 6, 15]
        Node result = solution.removeNthFromEnd(buildList(1, 5, 8, 6, 15), 3);
        assertArrayEquals(new int[]{1, 5, 6, 15}, toArray(result));
    }
}
