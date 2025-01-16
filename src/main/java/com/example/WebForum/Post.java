package com.example.WebForum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String username;
    private String content;

    Post(String username, String content){
        this.username = username;
        this.content = content;
    }
}
