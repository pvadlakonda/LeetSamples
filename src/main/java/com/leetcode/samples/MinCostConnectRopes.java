package com.leetcode.samples;

import java.util.PriorityQueue;

public class MinCostConnectRopes {


    public int minCost(int[] ropes) {
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int rope : ropes) {
            queue.add(rope);
        }

        while (queue.size() > 1) {
            int currentCost = queue.poll() + queue.poll();
            queue.add(currentCost);

            result += currentCost;
        }

        return result;
    }
}
