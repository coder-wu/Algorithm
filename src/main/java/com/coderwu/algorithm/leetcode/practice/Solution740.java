package com.coderwu.algorithm.leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
public class Solution740 {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> records = new HashMap<>();
        Arrays.stream(nums).forEach(i -> {
            int record = records.getOrDefault(i, 0);
            record++;
            records.put(i, record);
        });

        int[] dp = new int[10002];
        dp[1] = records.getOrDefault(1, 0);
        for (int i = 2; i < 10001; i++) {
            int earn = records.getOrDefault(i, 0) * i;
            dp[i] = Math.max(dp[i - 2] + earn, dp[i - 1]);
        }
        return dp[10000];
    }
}
