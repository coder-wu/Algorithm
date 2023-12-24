package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/9
 **/
class Solution120Test {
    private final Solution120 solution = new Solution120();

    @Test
    void minimumTotal() {
        assertEquals(11, solution.minimumTotal(
                ArrayUtils.twoIntList("[[2],[3,4],[6,5,7],[4,1,8,3]]")
        ));
        assertEquals(-10, solution.minimumTotal(
                ArrayUtils.twoIntList("[[-10]]")
        ));
    }
}