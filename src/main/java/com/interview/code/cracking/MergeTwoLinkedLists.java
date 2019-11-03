package com.interview.code.cracking;

public class MergeTwoLinkedLists {

    public Node merge(Node a, Node b) {
        Node tempNode = new Node();
        Node result = tempNode;

        while (a != null && b != null) {

            if (a.data < b.data) {
                tempNode.next = a;
                a = a.next;
            } else {
                tempNode.next = b;
                b = b.next;
            }
            tempNode = tempNode.next;
        }
        if (a != null) {
            tempNode.next = a;
        } else if (b != null) {
            tempNode.next = b;
        }
        return result.next;
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node() {
    }
};