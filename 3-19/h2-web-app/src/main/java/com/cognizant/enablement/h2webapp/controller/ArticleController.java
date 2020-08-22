package com.cognizant.enablement.h2webapp.controller;


import com.cognizant.enablement.h2webapp.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ArticleController {
    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public String findAllPost(Model model, HttpServletRequest httpServletRequest) {
        model.addAttribute("posts", articleService.findAllPost());
        return "listPost";
    }
}
