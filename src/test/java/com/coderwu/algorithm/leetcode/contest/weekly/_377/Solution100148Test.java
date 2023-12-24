package com.coderwu.algorithm.leetcode.contest.weekly._377;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
class Solution100148Test {
    private final Solution100148 solution = new Solution100148();

    @Test
    void numberGame() {
        assertArrayEquals(ArrayUtils.toIntArray("[3,2,5,4]"),
                solution.numberGame(ArrayUtils.toIntArray("[5,4,2,3]")));
        assertArrayEquals(ArrayUtils.toIntArray("[5,2]"),
                solution.numberGame(ArrayUtils.toIntArray("[2,5]")));
    }
}