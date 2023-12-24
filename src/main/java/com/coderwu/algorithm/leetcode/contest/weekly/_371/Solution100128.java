package com.coderwu.algorithm.leetcode.contest.weekly._371;

import java.util.*;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
public class Solution100128 {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<String>> allEmployeeRecords = new HashMap<>();
        access_times.forEach(i -> {
            List<String> employeeRecord = allEmployeeRecords.getOrDefault(i.get(0), new ArrayList<>());
            employeeRecord.add(i.get(1));
            allEmployeeRecords.put(i.get(0), employeeRecord);
        });

        List<String> highAccessEmployee = new ArrayList<>();
        allEmployeeRecords.forEach((name, times) -> {
            Collections.sort(times);
            for (int j = 0; j < times.size() - 2; j++) {
                if (Integer.parseInt(times.get(j + 2)) - Integer.parseInt(times.get(j)) < 100) {
                    highAccessEmployee.add(name);
                    break;
                }
            }
        });
        return highAccessEmployee;
    }
}
