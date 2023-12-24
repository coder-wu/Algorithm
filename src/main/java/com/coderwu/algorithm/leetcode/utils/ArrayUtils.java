package com.coderwu.algorithm.leetcode.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : coderWu
 * @since : 2023/12/8
 **/
public class ArrayUtils {
    private ArrayUtils() {}

    public static int[] toIntArray(String input) {
        List<Integer> intList = toIntList(input);

        int[] intArray = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            intArray[i] = intList.get(i);
        }

        return intArray;
    }

    public static List<Integer> toIntList(String input) {
        return Arrays.stream(
                        input.replace("[", "")
                                .replace("]", "")
                                .split(","))
                .map(Integer::valueOf).toList();
    }

    public static int[][] twoIntArray(String input) {
        List<List<Integer>> twoList = twoIntList(input);

        int rowCount = twoList.size();
        int columCount = twoList.getFirst().size();

        int[][] array = new int[rowCount][columCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columCount; j++) {
                array[i][j] = twoList.get(i).get(j);
            }
        }
        return array;
    }

    public static List<List<Integer>> twoIntList(String input) {
        return Arrays.stream(input.split("],"))
                .map(row -> row.replace("]", "")
                        .replace("[", "").split(","))
                .map(items ->
                        Arrays.stream(items).toList().stream().map(Integer::valueOf).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    public static char[] toCharArray(String input) {
        List<Character> charList = toCharList(input);

        char[] charArray = new char[charList.size()];
        for (int i = 0; i < charList.size(); i++) {
            charArray[i] = charList.get(i);
        }

        return charArray;
    }

    public static List<Character> toCharList(String input) {
        return Arrays.stream(
                input.replace("[", "")
                        .replace("]", "")
                        .replace("\"", "")
                        .split(","))
                .map(item -> item.charAt(0)).toList();
    }

    public static char[][] twoCharArray(String input) {
        List<List<Character>> twoList = twoCharList(input);

        int rowCount = twoList.size();
        int columCount = twoList.getFirst().size();

        char[][] array = new char[rowCount][columCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columCount; j++) {
                array[i][j] = twoList.get(i).get(j);
            }
        }
        return array;
    }

    public static List<List<Character>> twoCharList(String input) {
        return Arrays.stream(input.split("],"))
                .map(row -> row.replace("]", "")
                        .replace("[", "")
                        .replace("\"", "")
                        .split(","))
                .map(items -> Arrays.stream(items).map(item -> item.charAt(0)).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }
}
