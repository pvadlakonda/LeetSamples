package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void shouldReturnMinFromExample() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void shouldReturnTopAfterPush() {
        MinStack minStack = new MinStack();
        minStack.push(5);
        assertEquals(5, minStack.top());
    }

    @Test
    void shouldReturnMinForSingleElement() {
        MinStack minStack = new MinStack();
        minStack.push(42);
        assertEquals(42, minStack.getMin());
    }

    @Test
    void shouldUpdateMinAfterPop() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(1);
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(3, minStack.getMin());
    }

    @Test
    void shouldHandleDuplicateMinValues() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(2);
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
    }

    @Test
    void shouldHandleNegativeValues() {
        MinStack minStack = new MinStack();
        minStack.push(-1);
        minStack.push(-2);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void shouldReturnCorrectTopAfterMultiplePops() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.pop();
        assertEquals(2, minStack.top());
    }
}
