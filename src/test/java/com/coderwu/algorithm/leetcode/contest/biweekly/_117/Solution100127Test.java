package com.coderwu.algorithm.leetcode.contest.biweekly._117;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : coderWu
 * @since : 2023/11/11
 **/
class Solution100127Test {

    @Test
    void distributeCandies() {
        Solution100127 solution = new Solution100127();
        assertEquals(3, solution.distributeCandies(5, 2));
        assertEquals(10, solution.distributeCandies(3, 3));
        assertEquals(3, solution.distributeCandies(1, 2));
        assertEquals(1, solution.distributeCandies(3, 1));
        assertEquals(7, solution.distributeCandies(3, 2));
        assertEquals(33068333035L, solution.distributeCandies(257169, 765944));
    }
}