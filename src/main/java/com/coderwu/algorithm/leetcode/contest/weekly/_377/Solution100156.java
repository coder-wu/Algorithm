package com.coderwu.algorithm.leetcode.contest.weekly._377;

import java.util.Arrays;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
public class Solution100156 {
    private long[][] realCosts = new long[26][26];

    {
        Arrays.stream(realCosts).forEach(row -> Arrays.fill(row, -1));
        for (int i = 0; i < 26; i++) {
            realCosts[i][i] = 0;
        }
    }
    
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n = original.length;
        for (int i = 0; i < n; i++) {
            long realCost = getCost(original[i], changed[i]);
            if (realCost == -1 || realCost > cost[i]) {
                setCost(original[i], changed[i], cost[i]);
                for (int j = 0; j < 26; j++) {
                    long toTargetCost= getCost((char) ('a' + j), changed[i]);
                    long toOriginalCost = getCost((char) ('a' + j), original[i]);
                    if (toOriginalCost != -1) {
                        if (toTargetCost == -1) {
                            toTargetCost = Integer.MAX_VALUE;
                        }
                        setCost((char) ('a' + j), changed[i], Math.min(toOriginalCost + cost[i], toTargetCost));
                    }
                }
            }
        }

        long minCost = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) != target.charAt(i)) {
                long realCost = getCost(source.charAt(i), target.charAt(i));
                if (realCost == -1) {
                    return -1;
                }
                minCost += realCost;
            }
        }
        return minCost;
    }

    private long getCost(char c1, char c2) {
        return realCosts[(c1 - 'a')][c2 - 'a'];
    }

    private void setCost(char c1, char c2, long cost) {
        realCosts[(c1 - 'a')][c2 - 'a'] = cost;
    }
}
