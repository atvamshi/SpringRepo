package org.springdata.learn.springjpadatalearn.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: learn-spring-parent
 * Package: org.spring.learn.services
 * <p>
 * User: vthalapu
 * Date: 1/14/18
 * Time: 1:44 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CrypoServiceDynamic {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<CurrenciesModel> getAllCoinNames() {

        List<CurrenciesModel> currencyList = new ArrayList<>();
        currencyRepository.findAll()
                .forEach(currencyList::add);
        return currencyList;
//        return (List<CurrenciesModel>) currencyRepository.findAll();

    }


    public void addCoins(CurrenciesModel currenciesModel) {
        currencyRepository.save(currenciesModel);
    }

    public CurrenciesModel getCurrency(String curId) {
        return currencyRepository.findOne(curId);
    }

    public void updateCurrencies(CurrenciesModel currenciesModel, String currencyId) {
        currencyRepository.save(currenciesModel);
    }

    public void deleteCurrency(String currencyId) {
        currencyRepository.delete(currencyId);
    }



}
