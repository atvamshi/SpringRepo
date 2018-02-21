package org.springdata.learn.springjpadatalearn.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project: org.learnspring.parent
 * Package: org.springdata.learn.springjpadatalearn.constants
 * <p>
 * User: vthalapu
 * Date: 2/21/18
 * Time: 11:04 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertiesBean {

    @Value("${spring.profiles.active}")
    private String springProfilesActive;

    @Value("${management.port}")
    private int managementPort;

    @Value("${server.port}")
    private int serverPort;


    @Bean
    public PropertiesBean getPropertiesBean() {
        return new PropertiesBean();
    }


}
