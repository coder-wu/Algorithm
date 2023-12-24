package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.domain.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : coderWu
 * @since : 2023/12/16
 **/
public class Solution2415 {
    private final List<TreeNode> nodes = new ArrayList<>();

    public TreeNode reverseOddLevels(TreeNode root) {
        preTraversal(root);
        int depth = 1;
        for (int i = 14; i >=0 ; i--) {
            if (nodes.size() > 1 << i) {
                depth = i + 1;
                break;
            }
        }
        for (int i = 1; i <= depth; i++) {
            if (i % 2 != 0) {
                continue;
            }
            int startIndex = 1 << (i - 1);
            int endIndex = (1 << i) - 1;
            int midIndex = startIndex / 2;
            for (int j = 0; j < midIndex; j++) {
                TreeNode left = nodes.get(startIndex + j - 1);
                TreeNode right = nodes.get(endIndex - j - 1);
                int leftValue = left.val;
                left.val = right.val;
                right.val = leftValue;
            }
        }
        return root;
    }

    private void preTraversal(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode first = queue.removeFirst();
            nodes.add(first);
            if (first.left != null) {
                queue.addLast(first.left);
            }
            if (first.right != null) {
                queue.addLast(first.right);
            }
        }
    }
}
