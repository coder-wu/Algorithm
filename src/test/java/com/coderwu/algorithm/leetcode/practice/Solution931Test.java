package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/10
 **/
class Solution931Test {
    private final Solution931 solution = new Solution931();

    @Test
    void minFallingPathSum() {
        assertEquals(13, solution.minFallingPathSum(
                ArrayUtils.twoIntArray("[[2,1,3],[6,5,4],[7,8,9]]")
        ));
        assertEquals(-59, solution.minFallingPathSum(
                ArrayUtils.twoIntArray("[[-19,57],[-40,-5]]")
        ));
    }
}