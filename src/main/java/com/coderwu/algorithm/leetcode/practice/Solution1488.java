package com.coderwu.algorithm.leetcode.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author coderwu
 * @since 2021/5/30
 */
public class Solution1488 {

    public int[] avoidFlood(int[] rains) {
        Set<Integer> fullLake = new HashSet<>();
        List<Integer> dryDays = new ArrayList<>();
        int[] answer = IntStream.range(1, rains.length + 1).toArray();
        for (int i = 0; i < rains.length; i++) {
            int lake = rains[i];
            if (lake > 0) {
                if (fullLake.contains(lake)) {
                    if (!dryDays.isEmpty()) {
                        fullLake.remove(lake);
                        answer[dryDays.get(dryDays.size() - 1)] = lake;
                        dryDays.remove(dryDays.size() - 1);
                    } else {
                        return new int[0];
                    }
                } else {
                    fullLake.add(rains[i]);
                }
                answer[i] = -1;
            }

            if (lake == 0 && !fullLake.isEmpty()) {
                dryDays.add(i);
            }
        }

        return answer;

    }

}
