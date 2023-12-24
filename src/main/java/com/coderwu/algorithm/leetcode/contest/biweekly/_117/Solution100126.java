package com.coderwu.algorithm.leetcode.contest.biweekly._117;

import java.util.stream.LongStream;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class Solution100126 {
    public int MOD = 1000000000 + 7;
    public int stringCount(int n) {
        if (n < 4) {
            return 0;
        }

        long result = LongStream.range(0, 4)
                .reduce(1, (res, i) -> (n - i) * res) % MOD;
        result /= 2;
        result %= MOD;
        result = LongStream.range(4, n)
                .reduce(result, (res, i) -> (res * 26));
        result %= MOD;
        return (int) result;
    }
}
