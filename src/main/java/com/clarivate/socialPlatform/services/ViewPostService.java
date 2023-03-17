package com.clarivate.socialPlatform.services;

import java.util.List;

import com.clarivate.socialPlatform.entities.Post;

public interface ViewPostService{
	void addPost(Post post);
    List<Post> getPosts();
    void refresh();
    
    
}
