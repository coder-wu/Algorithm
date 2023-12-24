package com.coderwu.algorithm.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> index = new HashMap<>();
        int startIndex = 0;
        int maxSubLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charIndex = index.getOrDefault(c, i);
            if (charIndex == i || charIndex < startIndex) {
                maxSubLength = Math.max(i - startIndex + 1, maxSubLength);
            } else {
                startIndex = charIndex;
                while (startIndex < i && s.charAt(startIndex) == c) {
                    startIndex++;
                }
            }

            charIndex = i;
            index.put(c, charIndex);
        }

        return maxSubLength;
    }
}
