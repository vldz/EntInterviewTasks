package app.controllers;

import app.model.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
    @RequestMapping(value = "/numbers/sort-command", method = RequestMethod.POST)
    public String sort() {
        Sort numbers = new Sort();
        return numbers.numbersSort();
    }
}
