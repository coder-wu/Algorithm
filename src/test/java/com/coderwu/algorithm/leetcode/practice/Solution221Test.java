package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/10
 **/
class Solution221Test {
    private final Solution221 solution = new Solution221();

    @Test
    void maximalSquare() {
        assertEquals(9, solution.maximalSquare(
                ArrayUtils.twoCharArray("[[\"0\",\"0\",\"0\",\"1\"],[\"1\",\"1\",\"0\",\"1\"],[\"1\",\"1\",\"1\",\"1\"],[\"0\",\"1\",\"1\",\"1\"],[\"0\",\"1\",\"1\",\"1\"]]")
        ));
        assertEquals(4, solution.maximalSquare(
                ArrayUtils.twoCharArray("[[\"1\",\"1\"],[\"1\",\"1\"]]")
        ));
        assertEquals(4, solution.maximalSquare(
                ArrayUtils.twoCharArray("[[\"1\",\"0\",\"1\",\"0\",\"0\"],[\"1\",\"0\",\"1\",\"1\",\"1\"],[\"1\",\"1\",\"1\",\"1\",\"1\"],[\"1\",\"0\",\"0\",\"1\",\"0\"]]")
        ));
        assertEquals(1, solution.maximalSquare(
                ArrayUtils.twoCharArray("[[\"0\",\"1\"],[\"1\",\"0\"]]")
        ));
        assertEquals(0, solution.maximalSquare(
                ArrayUtils.twoCharArray("[[\"0\"]]")
        ));
    }
}