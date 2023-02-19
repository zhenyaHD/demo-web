package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<Post>();

        posts.add(new Post("Погиб знаменитый актёр Руслан Кравченко", new Date()));
        posts.add(new Post("В Китае назначили нового министра иностранных дел", new Date()));
        posts.add(new Post("В результате обрушения здания в Египте погибло 48 человек", new Date()));

        return posts;
    }
}
