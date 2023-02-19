package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }
    public int getLikes() { return likes; }
    public Date getCreationDate() { return creationDate; }
    public Long getId() { return id; }
    public void setLikes(int likes) {
        this.likes = likes;
    }
}
