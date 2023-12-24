package com.coderwu.algorithm.leetcode.contest.biweekly._117;

/**
 * @author : coderWu
 * @since : 2023/11/11
 **/
public class Solution100125 {
    public int distributeCandies(int n, int limit) {
        int max = Math.min(limit, n);
        int min = Math.max(0, n - limit * 2);
        int result = 0;
        for (int i = min; i <= max; i++) {
            int leftMin = Math.max(0, n - i - max);
            int leftMax = Math.min(max, n - i);
            result += leftMax - leftMin + 1;
        }
        return result;
    }

}
