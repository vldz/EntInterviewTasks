package app.controllers;

import app.model.NumbersHolder;
import app.service.SortService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
    private final SortService sortService;

    public SortController(SortService sortService) {
        this.sortService = sortService;
    }

    @RequestMapping(value = "/numbers/sort-command", method = RequestMethod.POST)
    public NumbersHolder sort(@RequestBody NumbersHolder numbersHolder) {
        NumbersHolder sortedNumbersHolder = new NumbersHolder();
        sortedNumbersHolder.setNumbers(sortService.sortAsc(numbersHolder.getNumbers()));
        return sortedNumbersHolder;
    }
}
