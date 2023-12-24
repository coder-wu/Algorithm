package com.coderwu.algorithm.leetcode.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void createNodeTest() {
        Solution2 solution = new Solution2();
        Solution2.ListNode list = solution.createList("123");
        assertEquals("123", solution.toString(list).toString());
    }

    @Test
    void addTwoNumbers() {
        Solution2 solution = new Solution2();
        Solution2.ListNode list1 = solution.createList("243");
        Solution2.ListNode list2 = solution.createList("564");
        Solution2.ListNode resultNode = solution.addTwoNumbers(list1, list2);
        String result = solution.toString(resultNode).toString();
        assertEquals("708", result);

        list1 = solution.createList("0");
        list2 = solution.createList("0");
        resultNode = solution.addTwoNumbers(list1, list2);
        result= solution.toString(resultNode).toString();
        assertEquals("0", result);

        list1 = solution.createList("9999999");
        list2 = solution.createList("9999");
        resultNode = solution.addTwoNumbers(list1, list2);
        result= solution.toString(resultNode).toString();
        assertEquals("89990001", result);

        list1 = solution.createList("249");
        list2 = solution.createList("5649");
        resultNode = solution.addTwoNumbers(list1, list2);
        result= solution.toString(resultNode).toString();
        assertEquals("70401", result);
    }
}