package com.cognizant.enablement.h2webapp.repository;

import com.cognizant.enablement.h2webapp.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
