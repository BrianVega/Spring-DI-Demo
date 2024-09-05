package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("environment")
public class EnvironmentServiceQaImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Quality Assurance";
    }
}
