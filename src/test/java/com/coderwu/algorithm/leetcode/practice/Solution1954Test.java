package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
class Solution1954Test {
    private final Solution1954 solution = new Solution1954();

    @Test
    void minimumPerimeter() {
        assertEquals(8, solution.minimumPerimeter(1));
        assertEquals(16, solution.minimumPerimeter(13));
        assertEquals(5040, solution.minimumPerimeter(1000000000));
    }
}