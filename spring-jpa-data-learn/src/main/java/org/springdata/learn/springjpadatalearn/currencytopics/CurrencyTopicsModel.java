package org.springdata.learn.springjpadatalearn.currencytopics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import org.springdata.learn.springjpadatalearn.currency.CurrenciesModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Project: learn-spring-parent
 * Package: org.springdata.learn.springjpadatalearn.dao
 * <p>
 * User: vthalapu
 * Date: 1/14/18
 * Time: 6:01 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@NoArgsConstructor
@JsonIgnoreProperties
@Entity(name="CurrencyTopicsModel")
public class CurrencyTopicsModel {


//    public CurrencyTopicsModel(String currencyTopicsId, String currencyTopicsName,
//                               String currencyTopicsDescription,
//                               CurrenciesModel currenciesModel) {
//        this.currencyTopicsId = currencyTopicsId;
//        this.currencyTopicsName = currencyTopicsName;
//        this.currencyTopicsDescription = currencyTopicsDescription;
//        this.currenciesModel = new CurrenciesModel();
//    }

    @Id
    private String currencyTopicsId;

    @Column(name="currencyTopicsName")
    private String currencyTopicsName;

    @Column(name="currencyTopicsDescription",length = 1000)
    private String currencyTopicsDescription;

    //    @Column(length = 1000)


    //    @ManyToOne //currencyId
    @ManyToOne(fetch = FetchType.EAGER)
    private CurrenciesModel currenciesModel;


    public String getcurrencyTopicsName() {
        return currencyTopicsName;
    }

    public void setcurrencyTopicsName(String currencyTopicsName) {
        this.currencyTopicsName = currencyTopicsName;
    }


    public String iscurrencyTopicsDescription() {
        return currencyTopicsDescription;
    }

    public void setcurrencyTopicsDescription(String currencyTopicsDescription) {
        this.currencyTopicsDescription = currencyTopicsDescription;
    }

    public String getcurrencyTopicsId() {
        return currencyTopicsId;
    }

    public void setcurrencyTopicsId(String currencyTopicsId) {
        this.currencyTopicsId = currencyTopicsId;
    }

    public CurrenciesModel getCurrenciesModel() {
        return currenciesModel;
    }

    public void setCurrenciesModel(CurrenciesModel currenciesModel) {
        this.currenciesModel = currenciesModel;
    }
}

