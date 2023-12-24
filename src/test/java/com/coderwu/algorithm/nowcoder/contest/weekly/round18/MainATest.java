package com.coderwu.algorithm.nowcoder.contest.weekly.round18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : coderWu
 * @since : 2023/11/11
 **/
class MainATest {

    @Test
    void revert() {
        assertEquals(213, MainA.revert("123", 2));
        assertEquals(4087, MainA.revert("80407", 4));
    }
}