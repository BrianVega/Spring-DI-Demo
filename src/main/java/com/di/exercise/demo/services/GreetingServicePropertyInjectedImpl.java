package com.di.exercise.demo.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService") // Custom Spring Bean name
public class GreetingServicePropertyInjectedImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!";
    }
}
