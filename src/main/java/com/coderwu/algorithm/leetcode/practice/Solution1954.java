package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
public class Solution1954 {
    public long minimumPerimeter(long neededApples) {
        long apples = 0;

        long edgeLength = 0;
        while (apples < neededApples) {
            edgeLength++;
            long leftApples = (2 + edgeLength) * (edgeLength + 1) / 2;
            long rightApples = (edgeLength + 2 * edgeLength) * (edgeLength + 1) / 2;
            apples = (leftApples + rightApples) * edgeLength / 2;
            apples *= 4;
        }

        return edgeLength * 8;
    }
}
