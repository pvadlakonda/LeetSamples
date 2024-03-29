package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void shouldReturnListWithAddedNumbersInReverse() {

        ListNode input1 = convertToListNode(342);
        ListNode input2 = convertToListNode(465);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(708, extractNumberFromList(listNodeResult));
    }

    @Test
    void test2() {
        //4003+4445 = 8448

        ListNode input1 = convertToListNode(3004);
        ListNode input2 = convertToListNode(5444);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(8448, extractNumberFromList(listNodeResult));
    }

    @Test
    void test3() {
        //8803+6623 = 15426

        ListNode input1 = convertToListNode(3088);
        ListNode input2 = convertToListNode(3266);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(62451, extractNumberFromList(listNodeResult));
    }

    @Test
    void test0() {
        //0+0 = 0

        ListNode input1 = convertToListNode(0);
        ListNode input2 = convertToListNode(0);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(0, extractNumberFromList(listNodeResult));
    }

    @Test
    void testLongNumbers() {

        ListNode input1 = convertToListNode(9);
        ListNode input2 = convertToListNode(9999999991L);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(8000000002L, extractNumberFromList(listNodeResult));
    }

    private ListNode convertToListNode(long input) {
        StringBuilder numberString = new StringBuilder(String.valueOf(input));


        String[] tokens = numberString.toString().split("");
        int stringLength = tokens.length;
        ListNode lastNode = new ListNode(Integer.valueOf(tokens[stringLength - 1]));
        ListNode resultList = lastNode;
        stringLength--;
        while (stringLength > 0) {
            ListNode tmpNode = new ListNode(Integer.valueOf(tokens[stringLength - 1]));
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
        return Long.parseLong(numberString.toString());
    }
}