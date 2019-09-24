package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void shouldReturnListWithAddedNumbersInReverse() {

        ListNode listNode1c = new ListNode(3);
        ListNode listNode1b = new ListNode(4, listNode1c);
        ListNode listNode1a = new ListNode(2, listNode1b);

        ListNode listNode2c = new ListNode(4);
        ListNode listNode2b = new ListNode(6, listNode2c);
        ListNode listNode2a = new ListNode(5, listNode2b);

       ListNode listNodeResult = addTwoNumbers.addTwoNumbers(listNode1a, listNode2a);



    }
}