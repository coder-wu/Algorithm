package com.coderwu.algorithm.nowcoder.contest.weekly.round19;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class MainB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int operate = 0;
        if (x >= 2 * y) {
            while (a > x) {
                a -= x;
                operate++;
            }
            while (b > x) {
                b -= x;
                operate++;
            }
        } else {
            while (a > y && b > y) {
                a -= y;
                b -= y;
                operate++;
            }
            while (a > y) {
                a -= x;
                operate++;
            }
            while (b > y) {
                b -= x;
                operate++;
            }
        }
        if (a <= y && b <= y) {
            operate++;
        } else {
            operate += 2;
        }

        System.out.println(operate);
        in.close();
    }
}
