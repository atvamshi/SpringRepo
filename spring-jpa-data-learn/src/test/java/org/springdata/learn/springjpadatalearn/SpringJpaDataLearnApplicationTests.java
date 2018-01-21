package org.springdata.learn.springjpadatalearn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaDataLearnApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertTrue("App Initialized",true);
	}

}
