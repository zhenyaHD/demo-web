package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>() {{
        add(new Post("Погиб знаменитый актёр Руслан Кравченко", new Date()));
        add(new Post("В Китае назначили нового министра иностранных дел", new Date()));
        add(new Post("В результате обрушения здания в Египте погибло 48 человек", new Date()));
    }};

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
