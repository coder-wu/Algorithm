package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        minCost[0] = cost[0];
        minCost[1] = cost[1];
        for (int j = 2; j < minCost.length; j++) {
            minCost[j] = Math.min(minCost[j - 1], minCost[j - 2]) + cost[j];
        }
        return Math.min(minCost[cost.length - 1], minCost[cost.length - 2]);
    }
}
