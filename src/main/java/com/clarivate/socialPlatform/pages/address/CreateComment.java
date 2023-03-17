package com.clarivate.socialPlatform.pages.address;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Comment;
import com.clarivate.socialPlatform.pages.Main;

public class CreateComment {
	@Property
    private Comment comment;
	 @Inject
	    private AlertManager alertManager;	
		@Inject
	    private Session session;
	    @InjectPage
	    private Main main;
	    
	    @CommitAfter
	    Object onSuccess()
	    {
	    	alertManager.success("Successfully commented!!");
	        session.persist(comment);

	        return main;
	    }
}
