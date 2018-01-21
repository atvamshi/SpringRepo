package org.springdata.learn.springjpadatalearn.currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Project: learn-spring-parent
 * Package: org.spring.learn.dao
 * <p>
 * User: vthalapu
 * Date: 1/14/18
 * Time: 1:30 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties

@Entity(name="CurrenciesModel")
public class CurrenciesModel {

    @Id
    private String currencyId;
    private String currencyName;
    private boolean usdEnabled;


    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }


    public boolean isUsdEnabled() {
        return usdEnabled;
    }

    public void setUsdEnabled(boolean usdEnabled) {
        this.usdEnabled = usdEnabled;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }
}
