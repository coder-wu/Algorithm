package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/9
 **/
class Solution63Test {
    private final Solution63 solution = new Solution63();

    @Test
    void uniquePathsWithObstacles() {
        assertEquals(2, solution.uniquePathsWithObstacles(
                ArrayUtils.twoIntArray("[[0,0,0],[0,1,0],[0,0,0]]")
        ));
        assertEquals(1, solution.uniquePathsWithObstacles(
                ArrayUtils.twoIntArray("[[0,1],[0,0]]")
        ));
        assertEquals(0, solution.uniquePathsWithObstacles(
                ArrayUtils.twoIntArray("[[0,0],[0,1]]")
        ));
    }
}