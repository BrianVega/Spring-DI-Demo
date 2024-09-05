package com.di.exercise.demo;

import com.di.exercise.demo.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

	@Autowired // Using application Context
	ApplicationContext applicationContext;

	@Autowired // Using Bean
	MyController myController;

	@Test
	void testGetControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromMyController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
