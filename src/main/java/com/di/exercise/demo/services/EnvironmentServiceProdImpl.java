package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("environment")
public class EnvironmentServiceProdImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Production";
    }
}
