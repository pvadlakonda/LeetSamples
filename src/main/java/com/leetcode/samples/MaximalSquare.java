package com.leetcode.samples;

/*
    Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

    Example 1:
    Input: matrix = [["1","0","1","0","0"],
                     ["1","0","1","1","1"],
                     ["1","1","1","1","1"],
                     ["1","0","0","1","0"]]
    Output: 4

    Example 2:
    Input: matrix = [["0","1"],
                     ["1","0"]]
    Output: 1

    Example 3:
    Input: matrix = [["0"]]
    Output: 0

    Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 300
    matrix[i][j] is '0' or '1'
 */
public class MaximalSquare {

    // DP approach: dp[i][j] = side length of the largest square with bottom-right corner at matrix[i-1][j-1]
    // Extra row/col of zeros (size m+1 x n+1) avoids boundary checks
    // Time: O(m*n), Space: O(m*n)
    public int maximalSquare(char[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int maxSide = 0;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    // Current side is limited by the smallest of the 3 neighbors (top, left, diagonal)
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        // return area = side^2
        return maxSide * maxSide;
    }
}
