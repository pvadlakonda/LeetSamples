package com.interview.code.cracking;

import org.junit.jupiter.api.Test;

class MergeTwoLinkedListsTest {
    private MergeTwoLinkedLists solution = new MergeTwoLinkedLists();

    @Test
    void shouldMergeLinkedLists() {

        int[] keys = { 1, 2, 3, 4, 5, 6, 7 };

        Node a = null, b = null;
        for (int i = keys.length - 1; i >= 0; i = i - 2) {
            a = a = new Node(keys[i], a);
        }

        for (int i = keys.length - 2; i >= 0; i = i - 2) {
            b = b = new Node(keys[i], b);
        }

        // print both linked list
        printList("First List  : ", a);
        printList("Second List : ", b);

        Node head = solution.merge(a, b);
        printList("After Merge : ", head);
    }

    @Test
    void shouldMergeLinkedLists2() {

        int[] keys = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Node a = null, b = null;
        for (int i = keys.length - 1; i >= 0; i = i - 2) {
            a = a = new Node(keys[i], a);
        }

        for (int i = keys.length - 2; i >= 0; i = i - 2) {
            b = b = new Node(keys[i], b);
        }

        // print both linked list
        printList("First List  : ", a);
        printList("Second List : ", b);

        Node head = solution.merge(a, b);
        printList("After Merge : ", head);
    }

    public static void printList(String msg, Node head)
    {
        System.out.print(msg);

        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

}