package com.clarivate.socialPlatform.pages.address;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.clarivate.socialPlatform.entities.Post;

public class ViewPost {
	
	@Inject
    private Session session;
	//public int getUserId;
    public List<Post> getPost()
    {
        return session.createCriteria(Post.class).list();
    
}
    
    
}
