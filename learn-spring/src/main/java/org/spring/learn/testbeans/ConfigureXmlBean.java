package org.spring.learn.testbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Project: learn-spring-parent
 * Package: org.spring.learn.testbeans
 * <p>
 * User: vthalapu
 * Date: 1/20/18
 * Time: 7:18 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class ConfigureXmlBean {
    private static int instances = 0;

    @Bean
//    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Qualifier("NoArgCons")
    public FilesBean getFilesBean() {
        instances = instances + 1;
        System.out.println("SCOPE_SINGLETON Bean -> " + instances);
        return new FilesBean("hello");
    }

//    @Bean
////    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Qualifier("AllArgCons")
//    public FilesBean getFilesBeanWithConsTructor() {
//        instances = instances + 1;
//        System.out.println("Prototyped Bean -> " + instances);
//        return new FilesBean("AllArgCons");
//    }

}
