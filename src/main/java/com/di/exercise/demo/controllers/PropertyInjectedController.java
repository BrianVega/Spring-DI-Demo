package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }

}
