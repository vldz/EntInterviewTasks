package app.service;

import app.model.currency.Currency;
import app.model.currency.CurrencyCode;
import app.model.currency.ResultValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {
    private static final Logger LOG = LoggerFactory.getLogger(CurrencyService.class);
    private final String URL = "http://api.nbp.pl/api/exchangerates/tables/A?format=jsonm";

    public ResultValue requestValue(CurrencyCode currencyCode) {
        RestTemplate restTemplate = new RestTemplate();
        Currency[] currency = restTemplate.getForObject(URL, Currency[].class);

        ResultValue resultValue = new ResultValue();
        try {
            resultValue.setValue(currency[0].getValueByName(currencyCode.getCurrency()));
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            LOG.error("Error occurred while trying to retrieve currency", e);
        }
        return resultValue;
    }

}
