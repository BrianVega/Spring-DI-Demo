package com.di.exercise.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("environment")
public class EnvironmentServiceDevImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "Development";
    }
}
