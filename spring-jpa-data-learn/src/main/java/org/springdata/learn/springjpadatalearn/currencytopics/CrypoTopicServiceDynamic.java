package org.springdata.learn.springjpadatalearn.currencytopics;

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
public class CrypoTopicServiceDynamic {

    @Autowired
    private CurrencyTopicRepository currencyTopicRepository;

    public List<CurrencyTopicsModel> getAllCoinTopicNames(String id) {

        List<CurrencyTopicsModel> currencyTopicList = new ArrayList<>();
        currencyTopicRepository.getByCurrenciesModelCurrencyId(id)
                .forEach(currencyTopicList::add);
        return currencyTopicList;

    }


    public void addTopicToCoin(CurrencyTopicsModel currencyTopicsModel) {
        currencyTopicRepository.save(currencyTopicsModel);
    }

    public CurrencyTopicsModel getCurrencyTopic(String curTopicId) {
        return currencyTopicRepository.findOne(curTopicId);
    }

    public void updateCurrenciyTopic(CurrencyTopicsModel currencyTopicsModel) {
        currencyTopicRepository.save(currencyTopicsModel);
    }

    public void deleteCurrencyTopic(String currencyTopicId) {
        currencyTopicRepository.delete(currencyTopicId);
    }



}
