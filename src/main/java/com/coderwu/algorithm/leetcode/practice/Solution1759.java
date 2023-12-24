package com.coderwu.algorithm.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution1759 {
    private static final int MODULO = 1000000000 + 7;
    public int countHomogenous(String s) {
        List<String> homogenousSubs = homogenousSubs(s);
        long totalCount = homogenousSubs.stream()
                                .mapToLong(String::length)
                                .map(i -> (1 + i) * i / 2)
                                .map(i -> i % MODULO)
                                .sum();

        return (int) (totalCount % MODULO);
    }

    private List<String> homogenousSubs(String s) {
        char current = s.charAt(0);
        List<String> subs = new ArrayList<>();
        StringBuilder sub = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == current) {
                sub.append(c);
            } else {
                subs.add(sub.toString());

                current = c;
                sub = new StringBuilder();
                sub.append(c);
            }
        }
        subs.add(sub.toString());

        return subs;
    }

}
