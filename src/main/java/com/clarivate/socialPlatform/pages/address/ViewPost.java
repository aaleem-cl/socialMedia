package com.clarivate.socialPlatform.pages.address;

import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.clarivate.socialPlatform.entities.Post;
import com.clarivate.socialPlatform.services.ViewPostService;


public class ViewPost {
	@Inject
    private ViewPostService viewPostService;
	
	@Property
	private Post post;

    public List<Post> getPosts()
    {
        return viewPostService.getPosts();
    
}
 
    
}
