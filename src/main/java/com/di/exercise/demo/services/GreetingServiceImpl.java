package com.di.exercise.demo.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from base service!";
    }
}
