package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

class Solution207Test {

    @Test
    void canFinish() {
        int sourceNum = 3;
        int[][] prerequisites = new int[][] {
                new int[] {2, 0},
                new int[] {1, 0}
        };

        Solution207 solution207 = new Solution207();
        System.out.println(solution207.canFinish(sourceNum, prerequisites));
    }
}