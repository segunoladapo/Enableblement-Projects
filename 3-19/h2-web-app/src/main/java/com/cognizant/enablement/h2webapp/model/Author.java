package com.cognizant.enablement.h2webapp.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    //posts
    @OneToMany( mappedBy = "author" )
    private List<Post> posts;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    private Author(){

    }

    public Author(String first, String last){
        this.setFirstName(first);
        this.setLastName(last);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
    }


}