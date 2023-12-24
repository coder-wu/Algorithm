package com.coderwu.algorithm.leetcode.contest.weekly._372;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
public class Solution100131 {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int commonLength = 0;
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
                commonLength = i + 1;
            } else {
                break;
            }
        }
        if (commonLength == 0) {
            return -1;
        }
        return s1.length() + s2.length() + s3.length() - 3 * commonLength;
    }
}
