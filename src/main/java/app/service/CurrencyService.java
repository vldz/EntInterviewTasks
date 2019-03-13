package app.service;

import app.model.currency.Currency;
import app.model.currency.CurrencyCode;
import app.model.currency.ResultMid;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {
    private final String URL = "http://api.nbp.pl/api/exchangerates/tables/A?format=jsonm";

    public ResultMid requestMid(CurrencyCode currencyCode) {
        RestTemplate restTemplate = new RestTemplate();
        Currency[] currency = restTemplate.getForObject(URL, Currency[].class);

        ResultMid resultMid = new ResultMid();
        resultMid.setValue(currency[0].getMid(currencyCode.getCurrency()));

        return resultMid;
    }

}
