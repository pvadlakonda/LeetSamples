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
        int num1 = extractNumberFromList(listNode1a);
        int num2 = extractNumberFromList(listNode1b);

        int resultNum = num1 + num2;

        //return new ListNode(resultNum);
        return convertToList(resultNum);
    }

    private ListNode convertToList(int number) {
        StringBuilder numberString = new StringBuilder(String.valueOf(number)).reverse();
        ListNode resultList = null;

        String[] tokens = numberString.toString().split("");
        int stringLength = tokens.length;
        ListNode lastNode = new ListNode(Integer.valueOf(tokens[stringLength - 1]));
        stringLength--;
        while (stringLength > 0) {
            ListNode tmpNode = new ListNode(Integer.valueOf(tokens[stringLength - 1]), lastNode);
            lastNode = tmpNode;
            resultList = tmpNode;
            stringLength--;
        }


        return resultList;
    }

    private int extractNumberFromList(ListNode listNode) {
        StringBuilder numberString = new StringBuilder("" + listNode.val);
        while (listNode.next != null) {
            numberString.append(listNode.next.val);
            listNode = listNode.next;
        }
        return Integer.parseInt(numberString.reverse().toString());
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode(int x, ListNode nextNode) {
        val = x;
        next = nextNode;
    }
}
