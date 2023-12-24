package com.coderwu.algorithm.leetcode.contest.weekly._372;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
class Solution100122Test {
    Solution100122 solution = new Solution100122();

    @Test
    void testMinimumSteps() {
        Assertions.assertEquals(1, solution.minimumSteps("101"));
        Assertions.assertEquals(2, solution.minimumSteps("100"));
        Assertions.assertEquals(0, solution.minimumSteps("0111"));
    }
}
