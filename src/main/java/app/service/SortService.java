package app.service;

import java.util.Arrays;

public class SortService {
    public static int[] decreasingSort(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        int [] sortedArray = new int[arrayToSort.length];

        int i = 0;
        int j = arrayToSort.length - 1;
        while (j >= 0) {
            sortedArray[i] = arrayToSort[j];
            i++;
            j--;
        }

        return sortedArray;
    }

    public static int[] increasingSort(int[] numbers) {
        Arrays.sort(numbers);
        int [] sortedArray = numbers;
        return sortedArray;
    }
}
