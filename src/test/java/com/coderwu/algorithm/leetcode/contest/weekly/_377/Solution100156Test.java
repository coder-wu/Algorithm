package com.coderwu.algorithm.leetcode.contest.weekly._377;

import com.coderwu.algorithm.leetcode.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
class Solution100156Test {
    private final Solution100156 solution = new Solution100156();

    @Test
    void minimumCost1() {
        String source = "abcd";
        String target = "acbe";
        char[] original = ArrayUtils.toCharArray("[\"a\",\"b\",\"c\",\"c\",\"e\",\"d\"]");
        char[] changed = ArrayUtils.toCharArray("[\"b\",\"c\",\"b\",\"e\",\"b\",\"e\"]");
        int[] cost = ArrayUtils.toIntArray("[2,5,5,1,2,20]");
        assertEquals(28, solution.minimumCost(source, target, original, changed, cost));
    }

    @Test
    void minimumCost2() {
        String source = "aaaa";
        String target = "bbbb";
        char[] original = ArrayUtils.toCharArray("[\"a\",\"c\"]");
        char[] changed = ArrayUtils.toCharArray("[\"c\",\"b\"]");
        int[] cost = ArrayUtils.toIntArray("[1,2]");
        assertEquals(12, solution.minimumCost(source, target, original, changed, cost));
    }

    @Test
    void minimumCost3() {
        String source = "abcd";
        String target = "abce";
        char[] original = ArrayUtils.toCharArray("[\"a\"]");
        char[] changed = ArrayUtils.toCharArray("[\"e\"]");
        int[] cost = ArrayUtils.toIntArray("[10000]");
        assertEquals(-1, solution.minimumCost(source, target, original, changed, cost));
    }

    @Test
    void minimumCost4() {
        String source = "aaadbdcdac";
        String target = "cdbabaddba";
        char[] original = ArrayUtils.toCharArray("[\"a\",\"c\",\"b\",\"d\",\"b\",\"a\",\"c\"]");
        char[] changed = ArrayUtils.toCharArray("[\"c\",\"a\",\"d\",\"b\",\"c\",\"b\",\"d\"]");
        int[] cost = ArrayUtils.toIntArray("[7,2,1,3,6,1,7]");
        assertEquals(39, solution.minimumCost(source, target, original, changed, cost));
    }
}
