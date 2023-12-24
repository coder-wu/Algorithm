package com.coderwu.algorithm.nowcoder.contest.weekly.round19;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class MainA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        StringBuilder result = new StringBuilder();
        String str = in.next();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(result);
        in.close();
    }
}
