package org.springdata.learn.springjpadatalearn.currency;

import org.springframework.data.repository.CrudRepository;

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
public interface CurrencyRepository extends CrudRepository<CurrenciesModel,String> {


    //getAllCurrenciesTopic()
    //getCurrency()
    //createcur
    //updatecur
    //delete

}
