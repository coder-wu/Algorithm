package com.coderwu.algorithm.leetcode.contest.biweekly._117;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
class Solution100126Test {

    @Test
    void stringCount() {
        Solution100126 solution = new Solution100126();
        assertEquals(12, solution.stringCount(4));
        assertEquals(83943898, solution.stringCount(10));
    }
}