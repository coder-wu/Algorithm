package com.coderwu.algorithm.leetcode.contest.weekly._371;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author : coderWu
 * @since : 2023/11/12
 **/
class Solution100128Test {
    Solution100128 solution100128 = new Solution100128();

    @Test
    void testFindHighAccessEmployees() {
        List<String> result = solution100128.findHighAccessEmployees(List.of(
                List.of("a", "0549"),
                List.of("b", "0457"),
                List.of("a", "0532"),
                List.of("a", "0621"),
                List.of("b", "0540")
        ));
        Assertions.assertTrue(
                CollectionUtils.isEqualCollection(
                        List.of("a"), result
                )
        );

        result = solution100128.findHighAccessEmployees(List.of(
                List.of("d", "0002"),
                List.of("c", "0808"),
                List.of("c", "0829"),
                List.of("e", "0215"),
                List.of("d", "1508"),
                List.of("d", "1444"),
                List.of("d", "1410"),
                List.of("c", "0809")
        ));
        Assertions.assertTrue(
                CollectionUtils.isEqualCollection(
                        List.of("c", "d"), result
                )
        );

        result = solution100128.findHighAccessEmployees(List.of(
               List.of ("cd","1025"),
               List.of ("ab","1025"),
               List.of ("cd","1046"),
               List.of ("cd","1055"),
               List.of ("ab","1124"),
               List.of ("ab","1120")
        ));
        Assertions.assertTrue(
                CollectionUtils.isEqualCollection(
                        List.of("ab", "cd"), result
                )
        );
    }
}
