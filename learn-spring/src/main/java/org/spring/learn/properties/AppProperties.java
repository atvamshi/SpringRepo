package org.spring.learn.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Project: org.learnspring.parent
 * Package: org.spring.learn.properties
 * <p>
 * User: vthalapu
 * Date: 1/22/18
 * Time: 6:55 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component
@Getter
@Setter
public class AppProperties {
    @Value("${spring.profiles.active}")
    private String securityRequireSsl;
}
