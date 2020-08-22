package com.cognizant.enablement.h2webapp.service;

import com.cognizant.enablement.h2webapp.model.Post;
import com.cognizant.enablement.h2webapp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    private PostRepository postRepository;

    public ArticleService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAllPost() {
        return (List<Post>) postRepository.findAll();
    }
}
