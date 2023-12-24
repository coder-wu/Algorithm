package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : coderWu
 * @since : 2023/12/16
 **/
class Solution2276Test {
    CountIntervals countIntervals;

    @BeforeEach
    void init() {
        countIntervals = new Solution2276().getCountIntervals();
    }

    @Test
    void testChar() {
        System.out.println(Integer.toBinaryString(Character.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Short.MAX_VALUE));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE).length());
    }

    @Test
    void case1() {
        countIntervals.add(39, 44);
        countIntervals.add(13, 49);
        assertEquals(37, countIntervals.count());
    }

    @Test
    void case2() {
        countIntervals.add(1, 1);
        assertEquals(1, countIntervals.count());
        countIntervals.add(2, 3);
        countIntervals.add(7, 10);
        assertEquals(7, countIntervals.count());
        countIntervals.add(5, 8);
        assertEquals(9, countIntervals.count());
    }

    @Test
    void case3() {
        countIntervals.add(365, 897);
        countIntervals.add(261, 627);
        countIntervals.add(781, 884);
        assertEquals(637, countIntervals.count());
    }

    @Test
    void case4() {
        countIntervals.add(54, 497);
        countIntervals.add(769, 937);
        countIntervals.add(572, 995);
        countIntervals.add(590, 700);
        countIntervals.add(729, 950);
        countIntervals.add(914, 972);
        countIntervals.add(314, 926);
        countIntervals.add(572, 965);
        assertEquals(942, countIntervals.count());
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeOutTest() {
        assertEquals(0, countIntervals.count());
        countIntervals.add(1, 1000000000);
        assertEquals(1000000000, countIntervals.count());
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeOutTest2() {
        assertEquals(0, countIntervals.count());
        assertEquals(0, countIntervals.count());
        assertEquals(0, countIntervals.count());
        assertEquals(0, countIntervals.count());
        assertEquals(0, countIntervals.count());
        assertEquals(0, countIntervals.count());
        countIntervals.add(34,50);
        countIntervals.add(1, 34);
    }


    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeOutTest3() {
        for (int i = 1; i < 44444; i++) {
            countIntervals.add(i, i);
            assertEquals(i, countIntervals.count());
        }
    }
}