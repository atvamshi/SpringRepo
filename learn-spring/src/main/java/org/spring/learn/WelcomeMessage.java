package org.spring.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.learn.properties.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: org.learnspring.parent
 * Package: org.spring.learn
 * <p>
 * User: vthalapu
 * Date: 1/22/18
 * Time: 6:54 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
public class WelcomeMessage {

    @Autowired
    AppProperties appProperties;
    private Logger logger = LoggerFactory.getLogger(WelcomeMessage.class);

    public void printProperties() {
        logger.info(appProperties.getSecurityRequireSsl());
    }


    public void printWelcomBanner() {
        System.out.println("*****************************************************************************************************");
        printProperties();

        System.out.println("/$$                                                  /$$$$$$                   /$$                  ");
        System.out.println("| $$                                                 /$$__  $$                 |__/                  ");
        System.out.println("| $$       /$$$$$$  /$$$$$$  /$$$$$$ /$$$$$$$       | $$  \\__/ /$$$$$$  /$$$$$$ /$$/$$$$$$$  /$$$$$$ ");
        System.out.println("| $$      /$$__  $$|____  $$/$$__  $| $$__  $$/$$$$$|  $$$$$$ /$$__  $$/$$__  $| $| $$__  $$/$$__  $$");
        System.out.println("| $$     | $$$$$$$$ /$$$$$$| $$  \\__| $$  \\ $|______/\\____  $| $$  \\ $| $$  \\__| $| $$  \\ $| $$  \\ $$");
        System.out.println("| $$     | $$_____//$$__  $| $$     | $$  | $$       /$$  \\ $| $$  | $| $$     | $| $$  | $| $$  | $$");
        System.out.println("| $$$$$$$|  $$$$$$|  $$$$$$| $$     | $$  | $$      |  $$$$$$| $$$$$$$| $$     | $| $$  | $|  $$$$$$$");
        System.out.println("|________/\\_______/\\_______|__/     |__/  |__/       \\______/| $$____/|__/     |__|__/  |__/\\____  $$");
        System.out.println("                                                            | $$                           /$$  \\ $$");
        System.out.println("                                                            | $$                          |  $$$$$$/");
        System.out.println("                                                            |__/                           \\______/ ");
        System.out.println("*****************************************************************************************************");

    }

}
