package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    @Test
    void sayGreetings() {
        System.out.println(constructorInjectedController.sayGreeting());
    }
}