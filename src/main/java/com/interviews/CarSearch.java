package com.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Input: [[0,1,5], [0,2,4], [1,1,7], [2,1,6]]
    inner arrays = [storeId, carId, carPrice]
    Return storeIds sorted by carPrice ascending for a given carId.
    Ex: carId=1 → [0, 2, 1] (prices 5, 6, 7 in stores 0, 2, 1)
 */

/*
    Time Complexity: O(n log n), due to sorting step.
    Space Complexity: O(n), for storing filtered results.
 */
public class CarSearch {

    public int[] searchByCarId(int[][] inventory, int targetCarId) {
        // 1. Filter: Find all stores selling the target car
        List<int[]> filteredStores = new ArrayList<>();
        for (int[] entry : inventory) {
            if (entry[1] == targetCarId) {
                filteredStores.add(entry);
            }
        }

        // 2. Sort: Order the filtered list by price (index 2)
        filteredStores.sort(Comparator.comparingInt(a -> a[2]));

        // 3. Extract: Get only the storeIds (index 0) into the final list
        List<Integer> result = new ArrayList<>();
        for (int[] entry : filteredStores) {
            result.add(entry[0]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
