package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/11/11
 **/
public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 1 && nums2.length == 1) {
            return (nums1[0] + nums2[0]) / 2.0;
        }
        int mid1 = getMid(nums1);
//        if (mid1 mid1)
        int max1 = nums1[nums1.length - 1];
        int mid2 = getMid(nums2);
        int max2 = nums2[nums2.length - 1];

        return 0.0;
    }

    public int getMid(int[] array) {
        return array[array.length / 2];
    }
}
