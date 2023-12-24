package com.coderwu.algorithm.nowcoder.contest.monthly.round84;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/12/22
 **/
public class MainC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        out:
        for (int i = 0; i < c; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int last = in.nextInt();
            long diff = 0;
            long lastDiff;
            for (int j = 1; j < n; j++) {
                int current = in.nextInt();
                lastDiff = (long) current - last;
                diff += lastDiff;
                if (Math.abs(diff) > k) {
                    System.out.println("No");
                    continue out;
                }
            }
            System.out.println("Yes");
        }
    }
}
