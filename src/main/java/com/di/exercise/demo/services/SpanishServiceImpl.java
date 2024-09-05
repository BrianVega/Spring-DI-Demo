package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo! - ES";
    }
}
