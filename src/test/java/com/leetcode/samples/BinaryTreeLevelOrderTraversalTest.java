package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.samples.util.TreeBuilder;
import com.leetcode.samples.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void shouldReturnThreeLevelsForBalancedTree() {
        Integer[] input = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeBuilder.constructTree(input);

        List<List<Integer>> result = solution.levelOrder(root);

        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), result);
    }

    @Test
    void shouldReturnSingleLevelForSingleNode() {
        Integer[] input = {1};
        TreeNode root = TreeBuilder.constructTree(input);

        List<List<Integer>> result = solution.levelOrder(root);

        assertEquals(List.of(List.of(1)), result);
    }

    @Test
    void shouldReturnEmptyListForNullRoot() {
        List<List<Integer>> result = solution.levelOrder(null);

        assertTrue(result.isEmpty());
    }

    @Test
    void shouldHandleNegativeValues() {
        Integer[] input = {-1000, -500, 1000};
        TreeNode root = TreeBuilder.constructTree(input);

        List<List<Integer>> result = solution.levelOrder(root);

        assertEquals(List.of(List.of(-1000), List.of(-500, 1000)), result);
    }

    @Test
    void shouldReturnThreeLevelsForBalancedTreeWithoutNulls() {
        Integer[] input = {3, 9, 20, 7, 9, 15, 7};
        TreeNode root = TreeBuilder.constructTree(input);

        List<List<Integer>> result = solution.levelOrder(root);

        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(7, 9, 15, 7)), result);
    }
}
