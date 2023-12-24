package com.coderwu.algorithm.leetcode.contest.weekly._377;

import java.util.Arrays;

/**
 * @author : coderWu
 * @since : 2023/12/24
 **/
public class Solution100148 {
    public int[] numberGame(int[] nums) {
        int[] array = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            array[i + 1] = nums[i];
        }
        for (int i = 1; i < nums.length; i += 2) {
            array[i - 1] = nums[i];
        }
        return array;
    }
}
