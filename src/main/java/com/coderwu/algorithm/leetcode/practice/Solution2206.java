package com.coderwu.algorithm.leetcode.practice;

import java.util.Arrays;

public class Solution2206 {
    public boolean divideArray(int[] numbs) {
        int[] records = new int[500];
        Arrays.stream(numbs).forEach(
                i -> records[i - 1]++
        );
        return Arrays.stream(records).filter(i -> i % 2 == 1)
                .findAny().isEmpty();
    }
}
