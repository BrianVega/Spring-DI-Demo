package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("environment")
public class EnvironmentServiceUatImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "User Acceptance Test";
    }
}
