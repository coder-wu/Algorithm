package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
public class Solution1137 {
    private final int[] records = new int[38];

    {
        records[0] = 0;
        records[1] = 1;
        records[2] = 1;
        for (int i = 3; i < 38; i++) {
            records[i] = records[i - 3] + records[i - 2] + records[i - 1];
        }
    }
    public int tribonacci(int n) {
        return records[n];
    }
}
