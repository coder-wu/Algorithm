package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1759Test {

    @Test
    void countHomogenous() {
        Solution1759 solution = new Solution1759();

        String case1 = "abbcccaa";
        assertEquals(13, solution.countHomogenous(case1));

        String case2 = "xy";
        assertEquals(2, solution.countHomogenous(case2));

        String case3 = "yyyyy";
        assertEquals(15, solution.countHomogenous(case3));
    }

    @Test
    void verifyTest() {
        System.out.println(4.1e-2);

        System.out.println(Integer.MAX_VALUE);
    }
}