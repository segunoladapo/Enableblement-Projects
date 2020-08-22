package com.cognizant.enablement.springbootapp.controller;


import com.cognizant.enablement.springbootapp.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/home", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping(value = "/message")
    public @ResponseBody
    ResponseEntity<String> message() {
        return new ResponseEntity<String>(homeService.message(), HttpStatus.OK);
    }

    @GetMapping(value = "/message/{message}")
    public @ResponseBody
    ResponseEntity<String> setMessage(@PathVariable String message) {
        return new ResponseEntity<String>("Hello!, " + message, HttpStatus.OK);
    }

    @GetMapping(value = "/appName")
    public @ResponseBody
    ResponseEntity<String> appName() {
        return new ResponseEntity<String>(homeService.appName(), HttpStatus.OK);
    }

}
