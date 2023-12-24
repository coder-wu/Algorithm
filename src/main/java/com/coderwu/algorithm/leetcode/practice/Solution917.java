package com.coderwu.algorithm.leetcode.practice;

import java.util.LinkedList;

@SuppressWarnings("unused")
public class Solution917 {

    public String reverseOnlyLetters(String S) {
        LinkedList<Character> letterStack = new LinkedList<>();
        LinkedList<Character> spList = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int[] isSp = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isLetter(c)) {
                letterStack.push(c);
            } else {
                isSp[i] = 1;
                spList.addLast(c);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (0 == isSp[i]) {
                sb.append(letterStack.pop());
            } else {
                sb.append(spList.removeFirst());
            }
        }
        return sb.toString();
    }

}
