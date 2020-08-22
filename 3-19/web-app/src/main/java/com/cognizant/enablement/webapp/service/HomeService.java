package com.cognizant.enablement.webapp.service;


import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String displayMessage(){
        return "Welcome to Web Application Project created using Spring MVC";
    }

}
