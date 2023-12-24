package com.coderwu.algorithm.nowcoder.contest.monthly.round84;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/12/22
 **/
public class MainB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            int gcd = in.nextInt();
            int lcm = in.nextInt();

            int count = 0;
            int value1 = gcd;
            while (value1 <= lcm) {
                if (value1 % gcd == 0 && lcm % value1 == 0) {
                    count++;
                    break;
                }
                value1++;
            }

            int value2 = value1;
            while (value2 <= lcm) {
                if (value2 % gcd == 0 && lcm % value2 == 0 && lcm / value2 <= 1) {
                    count++;
                    break;
                }
                value2++;
            }

            if (value1 > 0 && value2 >= value1 && value2 <= lcm && count == 2) {
                System.out.println(value1 + " " + value2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
