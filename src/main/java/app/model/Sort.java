package app.model;

import app.controllers.Exceptions.WrongTypeException;

import java.util.Arrays;

public class Sort {
    private final int[] numbers;
    private final String typeOfSort;

    public Sort() {
        this.numbers = new int[] {1, 5, 3, 9, 7};
        this.typeOfSort = "ASC"; //"DESC"
    }

    public String numbersSort() {
        int [] sortedArray = new int[numbers.length];
        Arrays.sort(numbers);
        if (typeOfSort.equals("ASC")) {
            sortedArray = numbers;
            return "numbers: " + Arrays.toString(sortedArray);
        } else if (typeOfSort.equals("DESC")){
            int i = 0;
            int j = numbers.length - 1;
            while (j >= 0) {
                sortedArray[i] = numbers[j];
                i++;
                j--;
            }
            return "numbers: " + Arrays.toString(sortedArray);
        } else {
            throw new WrongTypeException(typeOfSort);
        }
    }
}
