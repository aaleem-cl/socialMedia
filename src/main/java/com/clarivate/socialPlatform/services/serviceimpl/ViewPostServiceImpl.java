package com.clarivate.socialPlatform.services.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Post;
import com.clarivate.socialPlatform.entities.UserCreation;
import com.clarivate.socialPlatform.services.ViewPostService;

public class ViewPostServiceImpl implements ViewPostService {
	 @Inject
	    private Session session;

	    private List<Post> posts;
	@Override
	public void addPost(Post post) {
		post.setUserCreation(session.find(UserCreation.class, 1));
		post.setUserId(1);
		 session.persist(post);
	        refresh();
	}

	@Override
	public List<Post> getPosts() {
		
		if (posts == null) {
            refresh();
        }
        return posts;
		
	}

	@Override
	public void refresh() {
		posts = session.createCriteria(Post.class).list();

	}
	

}
