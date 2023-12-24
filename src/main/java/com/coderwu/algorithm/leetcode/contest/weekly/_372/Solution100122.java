package com.coderwu.algorithm.leetcode.contest.weekly._372;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
public class Solution100122 {
    public long minimumSteps(String s) {
        long zeroCount = 0;
        long zeroIndexSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
                zeroIndexSum += i;
            }
        }
        return zeroIndexSum - (zeroCount - 1) * zeroCount / 2;
    }
}
