package com.coderwu.algorithm.leetcode.practice;

@SuppressWarnings("all")
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String numberStr1 = toString(l1).reverse().toString();
        String numberStr2 = toString(l2).reverse().toString();
        StringBuilder result = new StringBuilder();
        int index = 0;
        boolean addOne = false;
        while (index < numberStr1.length() || index < numberStr2.length()) {
            int num1 = index < numberStr1.length() ?
                    numberStr1.charAt(numberStr1.length() - 1 - index) - '0' : 0;
            int num2 = index < numberStr2.length() ?
                    numberStr2.charAt(numberStr2.length() - 1 - index) - '0' : 0;
            int sum = num2 + num1;
            if (addOne) {
                sum++;
            }
            if (sum > 9) {
                addOne = true;
                result.append(sum - 10);
            } else {
                addOne = false;
                result.append(sum);
            }

            index++;
        }

        if (addOne) {
            result.append("1");
        }

        return createList(result.toString());
    }

    public ListNode createList(String str) {
        ListNode root = new ListNode(str.charAt(0) - '0');
        ListNode lastNode = root;
        for (int i = 1; i < str.length(); i++) {
            ListNode newNode = new ListNode(str.charAt(i) - '0');
            lastNode.next = newNode;
            lastNode = newNode;
        }
        return root;
    }

    public StringBuilder toString(ListNode root) {
        ListNode tmpNext = root;
        StringBuilder str = new StringBuilder();
        while (tmpNext != null) {
            str.append(tmpNext.val);
            tmpNext = tmpNext.next;
        }
        return str;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
