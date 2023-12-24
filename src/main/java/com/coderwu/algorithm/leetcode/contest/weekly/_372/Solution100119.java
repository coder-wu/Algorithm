package com.coderwu.algorithm.leetcode.contest.weekly._372;

/**
 * @author : coderWu
 * @since : 2023/11/19
 **/
public class Solution100119 {
    private final int MOD = 1000_000_000 + 7;
    public int maximumXorProduct(long a, long b, int n) {
        String aBin = Long.toBinaryString(a);
        String bBin = Long.toBinaryString(b);
        int maxLength = Math.max(aBin.length(), bBin.length());
        maxLength = Math.max(maxLength, n);

        StringBuilder newA = new StringBuilder();
        StringBuilder newB = new StringBuilder();
        boolean hasOne = false;
        for (int i = maxLength - 1; i >= 0; i--) {
            if (i >= aBin.length() && i >= bBin.length()) {
                newA.append('1');
                newB.append('1');
                hasOne = true;
            } else {
                char ac = '0';
                char bc = '0';
                if (aBin.length() > i) {
                    ac = aBin.charAt(aBin.length() - i - 1);
                }
                if (bBin.length() > i) {
                    bc = bBin.charAt(bBin.length() - i - 1);
                }
                if (!hasOne && i == 0) {
                    ac = ac == '1' ? '0' : '1';
                    bc = bc == '1' ? '0' : '1';
                } else {
                    if (ac == bc) {
                        if (ac == '0') {
                            hasOne = true;
                        }
                        ac = '1';
                        bc = '1';
                    } else {
                        if (a > b && ac == '0') {
                            hasOne = true;
                        }
                        if (b > a && bc == '0') {
                            hasOne = true;
                        }
                        ac = a > b ? '1' : '0';
                        bc = b > a ? '1' : '0';
                    }
                }
                newA.append(ac);
                newB.append(bc);
            }
        }
        a = Long.parseLong(newA.toString(), 2) % MOD;
        b = Long.parseLong(newB.toString(), 2) % MOD;
        return (int) (a * b) % MOD;
    }
}
