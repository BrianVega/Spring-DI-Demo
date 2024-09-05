package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class EnglishServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
