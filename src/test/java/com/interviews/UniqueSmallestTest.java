package com.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UniqueSmallestTest {

    private final UniqueSmallest solution = new UniqueSmallest();

    @Test
    void shouldReplaceDuplicatesWithSmallestPositives() {
        assertArrayEquals(new int[]{3, 14, 8, 1, 2, 7}, solution.makeUniqueSmallest(new int[]{3, 14, 8, 14, 8, 7}));
    }

    @Test
    void shouldReturnSameArrayWhenAllUnique() {
        assertArrayEquals(new int[]{1, 2, 3}, solution.makeUniqueSmallest(new int[]{1, 2, 3}));
    }

    @Test
    void shouldHandleAllDuplicates() {
        // {5, 5, 5} → first 5 kept, next two replaced with 1, 2
        assertArrayEquals(new int[]{5, 1, 2}, solution.makeUniqueSmallest(new int[]{5, 5, 5}));
    }

    @Test
    void shouldHandleSingleElement() {
        assertArrayEquals(new int[]{7}, solution.makeUniqueSmallest(new int[]{7}));
    }

    @Test
    void shouldHandleEmptyArray() {
        assertArrayEquals(new int[]{}, solution.makeUniqueSmallest(new int[]{}));
    }
}
