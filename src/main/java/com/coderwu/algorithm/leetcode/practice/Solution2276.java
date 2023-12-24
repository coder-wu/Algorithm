package com.coderwu.algorithm.leetcode.practice;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author : coderWu
 * @since : 2023/12/16
 **/
class CountIntervals {
    private final TreeMap<Integer, Integer> PERIODS = new TreeMap<>();

    private int size = 0;

    public CountIntervals() {

    }

    public void add(int left, int right) {
        int key = left;

        Map.Entry<Integer, Integer> upPeriod = PERIODS.floorEntry(key);
        if (upPeriod != null && left >= upPeriod.getKey() && left <= upPeriod.getValue()) {
            int newRight = Math.max(upPeriod.getValue(), right);
            PERIODS.replace(upPeriod.getKey(), newRight);
            key = upPeriod.getKey();
            size = size + Math.max(0, right - upPeriod.getValue());
        } else {
            PERIODS.put(left, right);
            size = size + right - left + 1;
        }

        Map.Entry<Integer, Integer> downPeriod = PERIODS.ceilingEntry(key + 1);
        while (downPeriod != null) {
            if (downPeriod.getKey() >= key && downPeriod.getKey() <= PERIODS.get(key)) {
                if (downPeriod.getValue() <= PERIODS.get(key)) {
                    size = size - (downPeriod.getValue() - downPeriod.getKey() + 1);
                } else {
                    size = size - (PERIODS.get(key) - downPeriod.getKey() + 1);
                    PERIODS.replace(key, downPeriod.getValue());
                }
                PERIODS.remove(downPeriod.getKey());
                downPeriod = PERIODS.ceilingEntry(key + 1);
            } else {
                break;
            }
        }
    }

    public int count() {
        return size;
    }

}

public class Solution2276 {
    public CountIntervals getCountIntervals() {
        return new CountIntervals();
    }
}
