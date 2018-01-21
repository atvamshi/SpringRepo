package org.springdata.learn.springjpadatalearn.currencytopics;

import org.springdata.learn.springjpadatalearn.currency.CurrenciesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Project: learn-spring-parent
 * Package: org.spring.learn.controllers
 * <p>
 * User: vthalapu
 * Date: 1/14/18
 * Time: 1:50 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value="/currencies")
public class CryptoTopicControllerDynamic {

    @Autowired
    private CrypoTopicServiceDynamic crypoTopicServiceDynamic;

    @RequestMapping(value="/{curId}/currencyTopics",method = RequestMethod.GET, produces = "application/json")
    @Valid
    public List<CurrencyTopicsModel> getAllCurrenciesTopic(@PathVariable String curId){
        return crypoTopicServiceDynamic.getAllCoinTopicNames(curId);
    }

    @RequestMapping(value= "/{curId}/currencyTopics/{curTopId}",method = RequestMethod.GET)
    public CurrencyTopicsModel getOneCurrenciesTopic(@Valid @PathVariable String curTopId){
        return crypoTopicServiceDynamic.getCurrencyTopic(curTopId);
    }

    @RequestMapping(value="/{curId}/currencyTopics",method = RequestMethod.POST )
    @Valid
    public void createCurrenciesTopic(@RequestBody CurrencyTopicsModel currenciesTopic, @PathVariable String curId){
        currenciesTopic.setCurrenciesModel(new CurrenciesModel(curId,"",false));
        crypoTopicServiceDynamic.addTopicToCoin(currenciesTopic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/{curId}/currencyTopics")
    @Valid
    public void updateCurrency(@RequestBody CurrencyTopicsModel currenciesTopic, @PathVariable String curId){
        currenciesTopic.setCurrenciesModel(new CurrenciesModel(curId,"",false));
        crypoTopicServiceDynamic.updateCurrenciyTopic(currenciesTopic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{curId}/currencyTopics/{curTopId}")
    @Valid
    public void deleteCurrency( @PathVariable String curTopId){
        crypoTopicServiceDynamic.deleteCurrencyTopic(curTopId);
    }

}
