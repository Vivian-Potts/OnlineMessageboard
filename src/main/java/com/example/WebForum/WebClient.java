package com.example.WebForum;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class WebClient {

    MessageBoard board = new MessageBoard(10);

    @GetMapping("get")
    @ResponseBody
    public ArrayList<Post> getMessages(){
        return board.getAllPosts();
    }

    @PostMapping("newMessage")
    @ResponseBody
    public String addPost(@RequestParam String username, @RequestParam String content){
        board.addPost(new Post(username, content));
        return "Success";
    }

}
