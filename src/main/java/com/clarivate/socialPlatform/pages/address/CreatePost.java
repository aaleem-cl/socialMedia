package com.clarivate.socialPlatform.pages.address;



import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Post;
import com.clarivate.socialPlatform.pages.Posts;
public class CreatePost {
	@Property
    private Post post;
	 @Inject
	    private AlertManager alertManager;	
		@Inject
	    private Session session;
	    @InjectPage
	    private Posts main;
	    
	    @CommitAfter
	    Object onSuccess()
	    {
	    	alertManager.success("Successfully posted!!");
	        session.persist(post);

	        return main;
	    }

}

