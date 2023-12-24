package com.coderwu.algorithm.leetcode.contest.weekly._371;

import java.util.Arrays;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class Solution100120 {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.parallelSort(nums);
        int maxXOR = 0;
        int maxBinaryLength = Integer.toBinaryString(nums[nums.length - 1]).length();
        boolean operated = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (operated && Integer.toBinaryString(nums[i]).length() < maxBinaryLength) {
                break;
            }

            maxBinaryLength = Integer.toBinaryString(nums[i]).length();
            int ahead = 1;
            while (ahead <= i && nums[i] <= nums[i - ahead] * 2) {
                maxXOR = Math.max(maxXOR, nums[i] ^ nums[i - ahead]);
                operated = true;
                ahead++;
            }
        }
        return maxXOR;
    }
}
