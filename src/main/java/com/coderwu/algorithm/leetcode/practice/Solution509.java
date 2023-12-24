package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/2
 **/
public class Solution509 {
    private final int[] record = new int[31];

    {
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i < 31; i++) {
            record[i] = record[i - 1] + record[i - 2];
        }
    }

    public int fib(int n) {
        return record[n];
    }
}
