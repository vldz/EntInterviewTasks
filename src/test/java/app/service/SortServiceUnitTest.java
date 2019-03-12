package app.service;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortServiceUnitTest {
    private SortService sortService = new SortService();

    @Test
    public void shouldReturnSortedNumbersInAscendingOrder() {
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> actualList = sortService.sort(Arrays.asList(1, 5, 3, 9, 7), true);

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnSortedNumbersInDescendingOrder() {
        List<Integer> expectedList = Arrays.asList(9, 7, 5, 3, 1);
        List<Integer> actualList = sortService.sort(Arrays.asList(1, 5, 3, 9, 7), false);

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnEmptyListIfNumbersIsNull() {
        List<Integer> expectedList = Collections.emptyList();
        List<Integer> actualList = sortService.sortAsc(null);

        assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnEmptyListIfNumbersIsEmpty() {
        List<Integer> expectedList = Collections.emptyList();
        List<Integer> actualList = sortService.sortAsc(Collections.emptyList());

        assertEquals(expectedList, actualList);
    }


}