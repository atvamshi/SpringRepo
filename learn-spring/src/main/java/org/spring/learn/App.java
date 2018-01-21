package org.spring.learn;

import org.spring.learn.testbeans.FilesBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Project: learn-spring
 * Package: org.spring.learn
 * <p>
 * User: vthalapu
 * Date: 1/13/18
 * Time: 11:27 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"org.spring.learn"})
public class App {

    public static void main(String...args){

        ApplicationContext appContxt = SpringApplication.run(App.class,args);
        appContxt.getBean(FilesBean.class).methodFilesBean();
        appContxt.getBean(FilesBean.class).methodFilesBean();
        appContxt.getBean(FilesBean.class).printFileType();
    }

}
