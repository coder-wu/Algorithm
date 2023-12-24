package com.coderwu.algorithm.leetcode.contest.weekly._371;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class Solution100117 {
    public int minOperations(int[] num1, int[] num2) {
        int operate1 = operate(num1, num2);
        if (operate1 == -1) {
            return operate1;
        }

        int tmp = num1[num1.length - 1];
        num1[num1.length - 1] = num2[num2.length - 1];
        num2[num2.length - 1] = tmp;

        int operate2 = operate(num1, num2) + 1;
        return Math.min(operate1, operate2);
    }

    public int operate(int[] num1, int[] num2) {
        int max1 = num1[num1.length - 1];
        int max2 = num2[num2.length - 1];
        int operate = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] <= max1 && num2[i] <= max2) {
                continue;
            }
            if (num1[i] <= max2 && num2[i] <= max1) {
                operate++;
                continue;
            }
            return - 1;
        }
        return operate;
    }
}
