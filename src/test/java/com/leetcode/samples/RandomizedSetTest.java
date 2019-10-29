package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomizedSetTest {

    private RandomizedSet solution = new RandomizedSet();

    @Test
    void name() {
        System.out.println(solution.insert(1));
        System.out.println(solution.remove(2));
        System.out.println(solution.insert(2));
        System.out.println(solution.getRandom());
        System.out.println(solution.remove(1));
        System.out.println(solution.insert(2));
        System.out.println(solution.getRandom());

    }

    @Test
    void test2() {
        System.out.println(solution.insert(-1));
        System.out.println(solution.remove(-2));
        System.out.println(solution.insert(-2));
        System.out.println(solution.getRandom());
        System.out.println(solution.remove(-1));
        System.out.println(solution.insert(-2));
        System.out.println(solution.getRandom());

    }

    @Test
    void test3() {
        System.out.println(solution.insert(1));
        System.out.println(solution.insert(2));
        System.out.println(solution.insert(3));
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());

    }
}