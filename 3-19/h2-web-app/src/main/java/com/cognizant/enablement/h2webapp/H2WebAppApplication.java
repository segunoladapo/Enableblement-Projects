package com.cognizant.enablement.h2webapp;

import com.cognizant.enablement.h2webapp.model.Post;
import com.cognizant.enablement.h2webapp.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2WebAppApplication {


    private static final Logger logger = LoggerFactory.getLogger(H2WebAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(H2WebAppApplication.class, args);
    }

    @Autowired
    private ArticleService articleService;

    @PostConstruct
    void seePosts() {
    	logger.info("Inside Method to log posts...");
        for (Post post : articleService.findAllPost()) {
            logger.info(post.toString());
        }
    }
}
