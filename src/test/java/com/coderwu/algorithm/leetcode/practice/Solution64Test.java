package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/8
 **/
class Solution64Test {
    private final Solution64 solution = new Solution64();

    @Test
    void minPathSum() {
        assertEquals(7, solution.minPathSum(
                ArrayUtils.twoIntArray("[[1,3,1],[1,5,1],[4,2,1]]")
        ));
        assertEquals(12, solution.minPathSum(
                ArrayUtils.twoIntArray("[[1,2,3],[4,5,6]]")
        ));
    }
}