package com.example.WebForum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebForumApplication {

	public static void main(String[] args) {

		MessageBoard board = new MessageBoard(20);
	for(int i = 0; i < 30; i++){
		board.addPost(new Post(String.valueOf(i), String.valueOf(i)));
	}
		System.out.println(board.getAllPosts().get(1).getUsername());


		SpringApplication.run(WebForumApplication.class, args);
	}

}
//Implement smarter object structure