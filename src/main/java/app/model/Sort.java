package app.model;

import app.controllers.Exceptions.WrongTypeException;
import app.service.SortService;

import java.util.Arrays;

public class Sort {
    private final int[] numbers;
    private final String typeOfSort;

    public Sort() {
        this.numbers = new int[] {1, 5, 3, 9, 7};
        this.typeOfSort = "ASC"; //"DESC"
    }

    public String numbersSort() {
        if (typeOfSort.equals("ASC")) {
            return "numbers: " +  Arrays.toString(SortService.increasingSort(numbers));
        } else if (typeOfSort.equals("DESC")){
            return "numbers: " + Arrays.toString(SortService.decreasingSort(numbers));
        } else {
            throw new WrongTypeException(typeOfSort);
        }
    }
}
