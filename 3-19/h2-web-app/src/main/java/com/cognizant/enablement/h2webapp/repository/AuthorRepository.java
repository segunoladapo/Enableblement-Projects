package com.cognizant.enablement.h2webapp.repository;


import com.cognizant.enablement.h2webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
