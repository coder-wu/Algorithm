package com.coderwu.algorithm.nowcoder.contest.weekly.round18;

import java.util.Scanner;

/**
 * @author : coderWu
 * @since : 2023/11/11
 **/
public class MainA {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String number = in.next();
        int k = in.nextInt();
        System.out.println(revert(number, k));
        in.close();
    }

    public static int revert(String number, int n) {
        StringBuilder newNumber = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            newNumber.append(number.charAt(i));
        }
        newNumber.append(number.substring(n));
        return Integer.parseInt(newNumber.toString());
    }
}
