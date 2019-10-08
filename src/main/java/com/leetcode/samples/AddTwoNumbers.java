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
        long num1 = extractNumberFromList(listNode1a);
        long num2 = extractNumberFromList(listNode1b);

        long resultNum = num1 + num2;

        return convertToList(resultNum);
    }

    private ListNode convertToList(long number) {
        StringBuilder numberString = new StringBuilder(String.valueOf(number)).reverse();

        String[] tokens = numberString.toString().split("");
        int stringLength = tokens.length;
        ListNode lastNode = new ListNode(Long.valueOf(tokens[stringLength - 1]));
        ListNode resultList = lastNode;
        stringLength--;
        while (stringLength > 0) {
            ListNode tmpNode = new ListNode(Long.valueOf(tokens[stringLength - 1]));
            tmpNode.next = lastNode;
            lastNode = tmpNode;
            resultList = tmpNode;
            stringLength--;
        }


        return resultList;
    }

    private long extractNumberFromList(ListNode listNode) {
        StringBuilder numberString = new StringBuilder("" + listNode.val);
        while (listNode.next != null) {
            numberString.append(listNode.next.val);
            listNode = listNode.next;
        }
        return Long.parseLong(numberString.reverse().toString());
    }
}

class ListNode {
    long val;
    ListNode next;

    ListNode(long x) {
        val = x;
    }
}
