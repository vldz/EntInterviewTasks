package app.model.currency;

import org.junit.Test;
import app.controllers.exceptions.WrongTypeException;

import java.util.ArrayList;
import java.util.List;

public class CurrencyUnitTest {

    @Test(expected = WrongTypeException.class)
    public void shouldReturnExceptionMessage() {
        Currency currency = new Currency();
        Rate rate1 = new Rate();
        rate1.setCode("EUR");
        rate1.setMid(4.3006);

        Rate rate2 = new Rate();
        rate2.setCode("USD");
        rate2.setMid(3.8077);

        List<Rate> rates = new ArrayList<>();
        rates.add(rate1);
        rates.add(rate2);

        currency.setRates(rates);

        currency.getValueByName("EURO");
    }
}