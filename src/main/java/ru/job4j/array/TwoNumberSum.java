package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return result;
    }
}