package com.coderwu.algorithm.leetcode.practice;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/27
 **/
class Solution2660Test {
    private final Solution2660 solution = new Solution2660();

    @Test
    void isWinner1() {
        assertEquals(1, solution.isWinner(
                ArrayUtils.toIntArray("[4,10,7,9]"),
                ArrayUtils.toIntArray("[6,5,2,3]")
        ));
    }

    @Test
    void isWinner2() {
        assertEquals(2, solution.isWinner(
                ArrayUtils.toIntArray("[3,5,7,6]"),
                ArrayUtils.toIntArray("[8,10,10,2]")
        ));
    }

    @Test
    void isWinner3() {
        assertEquals(0, solution.isWinner(
                ArrayUtils.toIntArray("[2,3]"),
                ArrayUtils.toIntArray("[4,1]")
        ));
    }

    @Test
    void isWinner4() {
        assertEquals(2, solution.isWinner(
                ArrayUtils.toIntArray("[5,6,1,10]"),
                ArrayUtils.toIntArray("[5,1,10,5]")
        ));
    }
}