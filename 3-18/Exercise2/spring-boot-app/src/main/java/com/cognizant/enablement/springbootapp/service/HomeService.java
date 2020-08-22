package com.cognizant.enablement.springbootapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Value("${app.name}")
    private String appName;

    public String message() {
        return "This is a text returned from HomeService.message()";
    }

    public String appName() {
        return appName;
    }


}
