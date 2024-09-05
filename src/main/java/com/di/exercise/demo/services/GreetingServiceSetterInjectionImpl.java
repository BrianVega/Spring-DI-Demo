package com.di.exercise.demo.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjectionImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from setter injection!";
    }
}
