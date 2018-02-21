package org.springdata.learn.springjpadatalearn;

import org.springdata.learn.springjpadatalearn.constants.PropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: org.learnspring.parent
 * Package: org.springdata.learn.springjpadatalearn
 * <p>
 * User: vthalapu
 * Date: 2/21/18
 * Time: 11:12 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
public class WelcomemessagePage {
    private PropertiesBean propertiesBean;

    @Autowired
    public void WelcomemessagePage(PropertiesBean propertiesBean) {
        this.propertiesBean = propertiesBean;
    }


    public void printWelcomeMessageBanner() {
        System.out.println("***************************************************************************************");
        System.out.println("┌─┐┌─┐┬─┐┬┌┐┌┌─┐   ┬┌─┐┌─┐");
        System.out.println("└─┐├─┘├┬┘│││││ ┬───│├─┘├─┤");
        System.out.println("└─┘┴  ┴└─┴┘└┘└─┘  └┘┴  ┴ ┴");
        System.out.println("***************************************************************************************");

        System.out.println(" Spring Active Profile --> " + propertiesBean.getSpringProfilesActive());
        System.out.println(" Server Port --> " + propertiesBean.getServerPort());
        System.out.println(" Management Port --> " + propertiesBean.getManagementPort());

        System.out.println("***************************************************************************************");


    }

}
