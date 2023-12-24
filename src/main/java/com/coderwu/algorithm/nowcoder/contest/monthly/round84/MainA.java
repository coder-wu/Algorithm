package com.coderwu.algorithm.nowcoder.contest.monthly.round84;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/12/22
 **/
public class MainA {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(y >= x && n - m >= y - x ? "Yes" : "No");
        }

        in.close();
    }
}
