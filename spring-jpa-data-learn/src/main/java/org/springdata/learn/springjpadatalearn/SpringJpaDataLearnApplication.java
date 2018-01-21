package org.springdata.learn.springjpadatalearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SpringJpaDataLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringJpaDataLearnApplication.class, args);
	}
}