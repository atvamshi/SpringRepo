package org.springdata.learn.springjpadatalearn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@ComponentScan(basePackages = "org.springdata.learn.springjpadatalearn")
@EnableScheduling
public class SpringJpaDataLearnApplication {

	public static void main(String[] args) {

		BeanFactory beanFactory = SpringApplication.run(SpringJpaDataLearnApplication.class, args);
		beanFactory.getBean(WelcomemessagePage.class).printWelcomeMessageBanner();

	}
}