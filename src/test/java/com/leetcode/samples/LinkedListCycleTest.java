package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class LinkedListCycleTest {
    private LinkedListCycle solution = new LinkedListCycle();

    @Test
    void name() {
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node0 = new LinkedListNode(0);
        LinkedListNode nodeMinus4 = new LinkedListNode(-4);

        nodeMinus4.next = node2;
        node0.next = nodeMinus4;
        node2.next = node0;
        node3.next = node2;

        assertTrue(solution.hasCycle(node3));
    }

    //[3,2,0,-4]
    private LinkedListNode buildNode(int[] values) {
        List<LinkedListNode> nodes = new LinkedList<>();

        for (int i = 0; i < values.length; i++) {
            nodes.add(new LinkedListNode(values[i]));
        }

        LinkedListNode head = nodes.get(0);
        for (int i= 1; i< nodes.size(); i++) {
            LinkedListNode tmpNode = nodes.get(i);
            head.next = tmpNode;
        }

        return head;

    }
}