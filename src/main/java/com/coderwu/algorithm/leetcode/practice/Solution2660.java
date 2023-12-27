package com.coderwu.algorithm.leetcode.practice;

/**
 * @author : coderWu
 * @since : 2023/12/27
 **/
public class Solution2660 {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = calculateScore(player1);
        int score2 = calculateScore(player2);

        return score1 == score2 ? 0 : score1 > score2 ? 1 : 2;
    }

    private int calculateScore(int[] scores) {
        byte doubleRound = 0;

        int sumScore = 0;
        for (int score : scores) {
            sumScore += score;

            if (doubleRound > 0) {
                sumScore += score;
                doubleRound--;
            }

            if (score == 10) {
                doubleRound = 2;
            }
        }

        return sumScore;
    }
}
