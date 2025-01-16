package com.example.WebForum;

import java.util.ArrayList;

public class MessageBoard {



    private ArrayList<Post> posts = new ArrayList<>();
    private int startPoint = 0;
    private int endpoint = 0;
    private int maxSize;

    MessageBoard(int maxSize){
        int endpoint = posts.size();
        //maxSize++;
        this.maxSize = maxSize;
        posts.add(new Post("test","testcontent"));
        endpoint++;
    }


    ArrayList<Post> getAllPosts(){

        ArrayList<Post> orderedPosts = new ArrayList<>(posts.size());
        int i = startPoint;
        while(true) {

            orderedPosts.add(posts.get(i));

            if (i == endpoint){
                break;
            }

            i++;

            if(i == posts.size()-1){
                i = 0;
            }
        }
        return orderedPosts;

    }

    void addPost(Post p){
        if(posts.size() == maxSize){
            posts.set(startPoint,p);
            //System.out.println(startPoint);
            //System.out.println(endpoint);
            startPoint++;
            endpoint++;
            if(startPoint == maxSize){
                startPoint = 0;
            }
            if (endpoint == maxSize){
                endpoint = 0;
            }
        }else{
            posts.add(p);
            endpoint++;
        }
    }


}
