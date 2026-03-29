package com.leetcode.samples.util;

import java.util.Queue;
import java.util.LinkedList;

public class TreeBuilder {
    public static TreeNode constructTree(Integer[] input) {
        if (input == null || input.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(input[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < input.length) {
            TreeNode current = queue.poll();
            // Handle left child
            if (i < input.length && input[i] != null) {
                current.left = new TreeNode(input[i]);
                queue.add(current.left);
            }
            i++;

            // Handle right child
            if (i < input.length && input[i] != null) {
                current.right = new TreeNode(input[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    // Example Usage:
    public static void main(String[] args) {
        Integer[] input = {3, 9, 20, null, null, 15, 7};
        TreeNode root = constructTree(input);

        // You can now use the 'root' TreeNode object
        // e.g., print the tree (level order traversal shown in search results)
    }
}

