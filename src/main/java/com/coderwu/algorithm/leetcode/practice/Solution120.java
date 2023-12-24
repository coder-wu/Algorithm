package com.coderwu.algorithm.leetcode.practice;

import java.util.List;

/**
 * @author : coderWu
 * @since : 2023/12/9
 **/
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() < 2) {
            return triangle.get(0).get(0);
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int topLeft = j - 1 < 0 ?
                        Integer.MAX_VALUE : triangle.get(i - 1).get(j - 1);
                int top = j >= triangle.get(i - 1).size() ?
                        Integer.MAX_VALUE : triangle.get(i - 1).get(j);
                int originalValue = triangle.get(i).get(j);
                int newValue = Math.min(topLeft, top) + originalValue;
                triangle.get(i).set(j, newValue);

                if (i == triangle.size() - 1) {
                    minValue = Math.min(minValue, newValue);
                }
            }
        }

        return minValue;
    }
}
