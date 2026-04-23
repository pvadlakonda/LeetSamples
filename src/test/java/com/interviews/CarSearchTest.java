package com.interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CarSearchTest {

    private final CarSearch solution = new CarSearch();

    // inventory: [storeId, carId, carPrice]
    private final int[][] inventory = {
            {0, 1, 5},
            {0, 2, 4},
            {1, 1, 7},
            {2, 1, 6}
    };

    @Test
    void shouldReturnStoresSortedByPriceForCarId1() {
        // prices: store0=5, store2=6, store1=7 → sorted: [0, 2, 1]
        assertArrayEquals(new int[]{0, 2, 1}, solution.searchByCarId(inventory, 1));
    }

    @Test
    void shouldReturnSingleStoreWhenCarExistsInOneStore() {
        // carId=2 only in store0 at price 4
        assertArrayEquals(new int[]{0}, solution.searchByCarId(inventory, 2));
    }

    @Test
    void shouldReturnEmptyWhenCarNotFound() {
        assertArrayEquals(new int[]{}, solution.searchByCarId(inventory, 99));
    }

    @Test
    void shouldHandleTiedPrices() {
        int[][] tiedInventory = {
                {0, 1, 5},
                {1, 1, 5},
                {2, 1, 8}
        };
        // stores 0 and 1 tied at price 5, store 2 at 8 — store2 must be last
        int[] result = solution.searchByCarId(tiedInventory, 1);
        assertArrayEquals(new int[]{2}, new int[]{result[result.length - 1]});
    }

    @Test
    void shouldHandleEmptyInventory() {
        assertArrayEquals(new int[]{}, solution.searchByCarId(new int[][]{}, 1));
    }
}
