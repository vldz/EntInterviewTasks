package app.controllers;

import app.model.numbers.NumbersHolder;
import app.model.numbers.ResultNumberHolder;
import app.service.SortService;
import org.junit.Test;
import app.controllers.exceptions.WrongTypeException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortControllerUnitTest {
    private SortService sortService = new SortService();
    private SortController sortController = new SortController(sortService);

    @Test
    public void shouldReturnSortedNumbersInASCOrder() {
        NumbersHolder numbersHolder = new NumbersHolder();
        numbersHolder.setNumbers(Arrays.asList(1, 5, 3, 9, 7));
        numbersHolder.setOrder("ASC");

        ResultNumberHolder resultNumberHolder = new ResultNumberHolder();
        resultNumberHolder.setNumbers(Arrays.asList(1, 3, 5, 7, 9));

        List<Integer> expectedList = resultNumberHolder.getNumbers();

        ResultNumberHolder actualNumberHolder = sortController.sort(numbersHolder);
        List<Integer> actualList = actualNumberHolder.getNumbers();

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnSortedNumbersInDESCOrder() {
        NumbersHolder numbersHolder = new NumbersHolder();
        numbersHolder.setNumbers(Arrays.asList(1, 5, 3, 9, 7));
        numbersHolder.setOrder("DESC");

        ResultNumberHolder resultNumberHolder = new ResultNumberHolder();
        resultNumberHolder.setNumbers(Arrays.asList(9, 7, 5, 3, 1));

        List<Integer> expectedList = resultNumberHolder.getNumbers();

        ResultNumberHolder actualNumberHolder = sortController.sort(numbersHolder);
        List<Integer> actualList = actualNumberHolder.getNumbers();

        assertEquals(expectedList, actualList);
    }

    @Test(expected = WrongTypeException.class)
    public void shouldReturnExceptionMessage() {
        NumbersHolder numbersHolder = new NumbersHolder();
        numbersHolder.setNumbers(Arrays.asList(1, 5, 3, 9, 7));
        numbersHolder.setOrder("WrongWords");

        sortController.sort(numbersHolder);
    }

}