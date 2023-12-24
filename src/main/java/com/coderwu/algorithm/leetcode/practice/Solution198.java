package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/3
 **/
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int[] robs = new int[nums.length];
        robs[0] = nums[0];
        robs[1] = Math.max(nums[0], nums[1]);
        for (int j = 2; j < nums.length; j++) {
            robs[j] = Math.max(robs[j - 2] + nums[j], robs[j - 1]);
        }
        return Math.max(robs[nums.length - 1], robs[nums.length - 2]);
    }
}
