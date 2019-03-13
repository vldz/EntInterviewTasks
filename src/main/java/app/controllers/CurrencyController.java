package app.controllers;

import app.model.currency.CurrencyCode;
import app.model.currency.ResultValue;
import app.service.CurrencyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @RequestMapping(value = "/currencies/get-current-currency-value-command", method = RequestMethod.POST)
    public ResultValue valueByCurrency(@RequestBody CurrencyCode currencyCode) {
        return currencyService.requestValue(currencyCode);
    }
}
