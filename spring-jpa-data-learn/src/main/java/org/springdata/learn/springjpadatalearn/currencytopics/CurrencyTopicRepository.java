package org.springdata.learn.springjpadatalearn.currencytopics;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Project: learn-spring-parent
 * Package: org.springdata.learn.springjpadatalearn.jpa
 * <p>
 * User: vthalapu
 * Date: 1/14/18
 * Time: 5:20 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface CurrencyTopicRepository extends CrudRepository<CurrencyTopicsModel,String> {

//    public List<CurrencyTopicsModel> findCurrencyTopicsModelsBycurrencyTopicsId();


    /**
     * Impressive
     * @param currencyId
     * @return
     */
    //Mapping object ref and its property
    List<CurrencyTopicsModel> getByCurrenciesModelCurrencyId(String currencyId);
//    List<CurrencyTopicsModel> getByCurrenciesModelCurrencyId(String currencyId);


    //get , find, delete etc.
}
