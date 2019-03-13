package app.controllers;

import app.model.currency.CurrencyCode;
import app.model.currency.ResultValue;
import app.service.CurrencyService;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyControllerUnitTest {
    private CurrencyService currencyService = new CurrencyService();
    private CurrencyController currencyController = new CurrencyController(currencyService);

    @Test
    public void shouldReturnValueByCurrencyCode() {
        CurrencyCode currencyCode = new CurrencyCode();
        currencyCode.setCurrency("EUR");

        ResultValue resultValue = new ResultValue();
        //value could change with time
        resultValue.setValue(4.3006);

        ResultValue actualResultValue = currencyController.valueByCurrency(currencyCode);

        double expected = resultValue.getValue();
        double actual = actualResultValue.getValue();

        assertEquals(expected, actual, 0.0001);
    }

}