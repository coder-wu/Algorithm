package com.coderwu.algorithm.nowcoder.contest.weekly.round19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class MainC {
    private static final int[] COUNT = new int[10005];

    static {
        Arrays.fill(COUNT, Integer.MAX_VALUE);
        COUNT[1] = 0;
        COUNT[2] = 1;
        for (int i = 3; i < COUNT.length; i++) {
            COUNT[i] = COUNT[i - 1] + 1;
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    COUNT[i] = Math.min(COUNT[i], COUNT[j] + COUNT[i / j] + 1);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int operate = 0;
        for (int i = 0; i < n; i++) {
            operate += COUNT[in.nextInt()];
        }
        System.out.println(operate);

        in.close();
    }
}
