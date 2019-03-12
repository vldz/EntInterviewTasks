package app.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class SortService {

    public List<Integer> sortAsc(List<Integer> numbers) {
        return sort(numbers, true);
    }

    public List<Integer> sortDesc(List<Integer> numbers) {
        return sort(numbers, false);
    }

    public List<Integer> sort(List<Integer> numbers, boolean naturalOrder) {
        if (numbers != null) {
            List<Integer> sortedNumbers = new ArrayList<>(numbers);
            if (naturalOrder) {
                Collections.sort(sortedNumbers);
            } else {
                Collections.sort(sortedNumbers, Comparator.reverseOrder());
            }
            return sortedNumbers;
        } else {
            return Collections.emptyList();
        }
    }
}
