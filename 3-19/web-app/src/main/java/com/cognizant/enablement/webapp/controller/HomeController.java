package com.cognizant.enablement.webapp.controller;

import com.cognizant.enablement.webapp.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("message", homeService.displayMessage());
        return "index";
    }
    @GetMapping("/{message}")
    public String displayCustomMessage(@PathVariable String message, Model model, HttpServletRequest request) throws Exception{
        if (message == null || message.isEmpty() || message.length() < 5) {
            throw new Exception("Please provide a valid Message to display");
        }
        model.addAttribute("message", message);
        return "index";
    }

    @GetMapping("/404")
    public String pageNotFound(Model model, HttpServletRequest request) {
        return "404";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception ex, Model model) {
        model.addAttribute("errorMsg", ex.getMessage());
        return "error";
    }
}
