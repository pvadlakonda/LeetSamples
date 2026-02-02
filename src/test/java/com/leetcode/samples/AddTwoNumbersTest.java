package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void shouldReturnListWithAddedNumbersInReverse() {

        ListNode input1 = convertToListNode(342);
        ListNode input2 = convertToListNode(465);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(807, extractNumberFromList(listNodeResult)); // 342 + 465 = 807
    }

    @Test
    void test2() {
        // 3004 + 5444 = 8448

        ListNode input1 = convertToListNode(3004);
        ListNode input2 = convertToListNode(5444);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(8448, extractNumberFromList(listNodeResult));
    }

    @Test
    void test3() {
        // 3088 + 3266 = 6354

        ListNode input1 = convertToListNode(3088);
        ListNode input2 = convertToListNode(3266);

        ListNode listNodeResult = addTwoNumbers.addTwoNumbers(input1, input2);
        assertEquals(6354, extractNumberFromList(listNodeResult));
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
        assertEquals(10000000000L, extractNumberFromList(listNodeResult)); // 9 + 9999999991 = 10000000000
    }

    private ListNode convertToListNode(long input) {
        String numberString = String.valueOf(input);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Process digits from right to left (reverse order)
        for (int i = numberString.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            current.next = new ListNode(digit);
            current = current.next;
        }
        
        return dummy.next;
    }

    private long extractNumberFromList(ListNode listNode) {
        StringBuilder numberString = new StringBuilder();
        while (listNode != null) {
            numberString.insert(0, listNode.val); // Insert at beginning to reverse
            listNode = listNode.next;
        }
        return Long.parseLong(numberString.toString());
    }
}