package com.di.exercise.demo.controllers;

import com.di.exercise.demo.services.EnvironmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentService environmentService;

    @Test
    void getEnvironment() {
        System.out.println(environmentService.getEnvironment());
    }
}