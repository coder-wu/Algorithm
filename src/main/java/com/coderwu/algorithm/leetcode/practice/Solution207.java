package com.coderwu.algorithm.leetcode.practice;

/**
 * @author coderwu
 * @since 2020/9/12
 */
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visitable = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, prerequisites, visitable)) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int start, int[][] prerequisites, int[] visitable) {
        if (visitable[start] == 2) {
            return false;
        }
        if (visitable[start] == 1) {
            return true;
        }
        for (int[] prerequisite : prerequisites) {
            if (prerequisite[0] == start) {
                visitable[start] = 1;
                if (dfs(prerequisite[1], prerequisites, visitable)) {
                    return true;
                }
            }
        }
        visitable[start] = 2;
        return false;
    }
}
