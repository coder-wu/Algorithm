package com.coderwu.algorithm.leetcode.contest.weekly._371;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
class Solution100120Test {

    @Test
    void maximumStrongPairXor() {
        Solution100120 solution = new Solution100120();
//        assertEquals(7, solution.maximumStrongPairXor(new int[] {1, 2, 3, 4, 5}));
//        assertEquals(0, solution.maximumStrongPairXor(new int[] {10, 100}));
//        assertEquals(7, solution.maximumStrongPairXor(new int[] {5, 6, 25, 30}));
//        assertEquals(3, solution.maximumStrongPairXor(new int[] {1, 1, 10, 3, 9}));
//        assertEquals(3, solution.maximumStrongPairXor(new int[] {1, 5, 4, 1, 7}));
        assertEquals(1020, solution.maximumStrongPairXor(new int[] {500, 520, 2500, 3000}));
    }
}