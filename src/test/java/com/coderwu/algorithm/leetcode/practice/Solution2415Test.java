package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.domain.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/16
 **/
class Solution2415Test {

    private final Solution2415 solution = new Solution2415();

    @Test
    void reverseOddLevels() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(1);
        root.right.left.left = new TreeNode(2);
        root.right.left.right = new TreeNode(2);
        root.right.right.left = new TreeNode(2);
        root.right.right.right = new TreeNode(2);
        assertEquals(2, solution.reverseOddLevels(root).left.val);
    }
}