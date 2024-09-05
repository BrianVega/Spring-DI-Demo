package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }

}
