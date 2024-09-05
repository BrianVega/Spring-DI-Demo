package com.di.exercise.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		MyController controller = applicationContext.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(controller.sayHello());
	}

}
