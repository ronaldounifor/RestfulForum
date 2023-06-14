package com.pas.forum;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path="/posts")
public class PostController {
    private ArrayList<Post> posts = new ArrayList<>();

    @GetMapping
    public String getPosts() {
        return posts.toString();
    }

    @GetMapping(path="/{id}")
    public String getPost(@PathVariable int id) {
        return posts.get(id).toString();
    }

    @PostMapping
    public String createPost(@RequestBody Post post) {
        posts.add(post);
        return "Post adicionado com sucesso";
    }

    @PutMapping
    public String updatePost(@RequestBody Post post) {
        posts.add(post);
        return "Post atualizado com sucesso";
    }

    @DeleteMapping(path="/{id}")
    public String deletePost(@PathVariable int id) {
        posts.remove(id);
        return "Post deletado com sucesso";
    }
    
}
