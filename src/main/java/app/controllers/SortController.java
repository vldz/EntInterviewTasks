package app.controllers;

import app.controllers.Exceptions.WrongTypeException;
import app.model.NumbersHolder;
import app.model.ResultNumberHolder;
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
    public ResultNumberHolder sort(@RequestBody NumbersHolder numbersHolder) {
        ResultNumberHolder sortedNumbersHolder = new ResultNumberHolder();
        String order = numbersHolder.getOrder();

        if (order.equals("ASC")) {
            sortedNumbersHolder.setNumbers(sortService.sortAsc(numbersHolder.getNumbers()));
        } else if (order.equals("DESC")) {
            sortedNumbersHolder.setNumbers(sortService.sortDesc(numbersHolder.getNumbers()));
        } else {
            throw new WrongTypeException(order);
        }

        return sortedNumbersHolder;
    }
}
