package com.coderwu.algorithm.leetcode.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/9
 **/
class ArrayUtilsTest {

    @Test
    void twoIntArray() {
        int[][] zeroZero = ArrayUtils.twoIntArray("[[0,0],[1,1]]");
        zeroZero[0][0] = 1;
        assertEquals(1, zeroZero[0][0]);
    }

    @Test
    void twoIntList() {
        List<List<Integer>> mutableList = ArrayUtils.twoIntList("[[0],[1,1]]");
        mutableList.get(0).set(0, 1);
        assertEquals(1, mutableList.get(0).get(0));
    }
}