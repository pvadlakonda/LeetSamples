package com.leetcode.samples;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode listNode1a, ListNode listNode1b) {

        ListNode resultNode = new ListNode(0);
        int carry = 0;

        while (listNode1a != null || listNode1b != null) {
            int i = listNode1a != null ? listNode1a.val : 0;
            int j = listNode1b != null ? listNode1b.val : 0;

            ListNode currNode = new ListNode((carry + i + j) % 10);
            carry = (carry + i + j) / 10;

            resultNode.next = currNode;
            resultNode = currNode;

            listNode1a = listNode1a != null ? listNode1a.next : null;
            listNode1b = listNode1b != null ? listNode1b.next : null;
        }

        return resultNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
