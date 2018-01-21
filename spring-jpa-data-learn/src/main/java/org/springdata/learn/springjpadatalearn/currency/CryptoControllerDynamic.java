package org.springdata.learn.springjpadatalearn.currency;

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
public class CryptoControllerDynamic {

    @Autowired
    private CrypoServiceDynamic crypoServiceDynamic;

    @RequestMapping(value="/currencies",method = RequestMethod.GET, produces = "application/json")
    @Valid
    public List<CurrenciesModel> getAllCurrencies(){
        return crypoServiceDynamic.getAllCoinNames();
    }

    @RequestMapping(value= "/currencies/{curId}",method = RequestMethod.GET)
    public CurrenciesModel getOneCurrencies(@Valid @PathVariable String curId){
        return crypoServiceDynamic.getCurrency(curId);
    }

    @RequestMapping(value="/currencies",method = RequestMethod.POST )
    @Valid
    public void createCurrency(@RequestBody CurrenciesModel currenciesModel){
        crypoServiceDynamic.addCoins(currenciesModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/currencies/{curId}")
    @Valid
    public void updateCurrency(@RequestBody CurrenciesModel currenciesModel, @PathVariable String curId){
        crypoServiceDynamic.updateCurrencies(currenciesModel,curId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/currencies/{curId}")
    @Valid
    public void deleteCurrency( @PathVariable String curId){
        crypoServiceDynamic.deleteCurrency(curId);
    }



}
