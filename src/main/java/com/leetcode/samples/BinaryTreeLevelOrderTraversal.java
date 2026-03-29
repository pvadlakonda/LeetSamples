package com.leetcode.samples;

import com.leetcode.samples.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
    Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[9,20],[15,7]]
    Example 2:

    Input: root = [1]
    Output: [[1]]
    Example 3:

    Input: root = []
    Output: []

    Constraints:
    The number of nodes in the tree is in the range [0, 2000].
    -1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        traverse(result, root, 0);

        return result;
    }

    private void traverse(List<List<Integer>> result, TreeNode node, int level) {

        if (node == null) return;

        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);
        traverse(result, node.left, level + 1);
        traverse(result, node.right, level + 1);
    }
}
