package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environment") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in: " + environmentService.getEnvironment() + " Environment";
    }
}
