package com.leetcode.samples;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(LinkedListNode head) {

        Set<LinkedListNode> nodes = new HashSet<>();

        while (head != null) {
            if(nodes.contains(head)) {
                return true;
            }
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
}

class LinkedListNode {
    int val;
    LinkedListNode next;

    LinkedListNode(int x) {
        val = x;
        next = null;
    }
}
