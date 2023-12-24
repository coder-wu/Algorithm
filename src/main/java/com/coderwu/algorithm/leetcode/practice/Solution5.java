package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/10
 **/
public class Solution5 {
    public String longestPalindrome(String s) {
        int n = s.length();

        String sub = "";
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
            }
            while (right < n && s.charAt(right) == s.charAt(i)) {
                right++;
            }
            while (left >= 0 && right < n) {
                if (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            if (right - left - 1 > sub.length()) {
                sub = s.substring(++left, right);
            }
        }
        return sub;
    }
}
