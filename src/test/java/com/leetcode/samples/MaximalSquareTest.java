package com.leetcode.samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximalSquareTest {

    private final MaximalSquare solution = new MaximalSquare();

    @Test
    void shouldReturn4ForStandardMatrix() {
        char[][] matrix = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        assertEquals(4, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn1ForDiagonalOnes() {
        char[][] matrix = {{'0','1'},{'1','0'}};
        assertEquals(1, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn0ForAllZeros() {
        char[][] matrix = {{'0'}};
        assertEquals(0, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn1ForSingleOne() {
        char[][] matrix = {{'1'}};
        assertEquals(1, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn4ForAllOnes2x2() {
        char[][] matrix = {
            {'1','1'},
            {'1','1'}
        };
        assertEquals(4, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn9ForAllOnes3x3() {
        char[][] matrix = {
            {'1','1','1'},
            {'1','1','1'},
            {'1','1','1'}
        };
        assertEquals(9, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn1ForSingleRow() {
        char[][] matrix = {{'1','0','1','1','1'}};
        assertEquals(1, solution.maximalSquare(matrix));
    }

    @Test
    void shouldReturn0ForNullMatrix() {
        assertEquals(0, solution.maximalSquare(null));
    }

    @Test
    void shouldReturn0ForEmptyMatrix() {
        assertEquals(0, solution.maximalSquare(new char[][]{}));
    }

    @Test
    void shouldReturn0ForEmptyRow() {
        assertEquals(0, solution.maximalSquare(new char[][]{{}}) );
    }
}
