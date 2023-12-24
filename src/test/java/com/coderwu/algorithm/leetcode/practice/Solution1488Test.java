package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Solution1488Test {

    @Test
    void avoidFlood() {
        int[][] cases = new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 0, 0, 2, 1},
                new int[]{1, 2, 0, 1, 2},
                new int[]{69, 0, 0, 0, 69},
                new int[]{10, 20, 20},
                new int[]{0, 1, 1},
                new int[]{1,0,2,0,2,1}
        };

        for (int[] caseItem : cases) {
            Arrays.stream(new Solution1488().avoidFlood(caseItem))
                    .forEach(System.out::print);
            System.out.println();
        }

    }
}