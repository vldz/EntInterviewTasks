package app.model.currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    private String tableName;
    private String no;
    private String effectiveDate;

    private List<Rate> rates;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public double getMid(String name) {
        for (int i = 0; i < rates.size(); i++) {
            if (rates.get(i).getCode().equals(name)) {
                return rates.get(i).getMid();
            }
        }
        return 0.0;
    }
}
