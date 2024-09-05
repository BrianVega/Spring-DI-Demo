package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
