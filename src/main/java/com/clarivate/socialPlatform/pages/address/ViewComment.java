package com.clarivate.socialPlatform.pages.address;



import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Comment;
import com.clarivate.socialPlatform.services.CommentService;

public class ViewComment {
	 @Inject
	    private CommentService commentService;
	 
	    @Property
	    private Comment comment;

	    public List<Comment> getComments() {
	        return commentService.getComments();
	    }


}

