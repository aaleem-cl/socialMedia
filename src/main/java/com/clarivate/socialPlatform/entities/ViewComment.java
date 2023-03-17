package com.clarivate.socialPlatform.entities;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import com.clarivate.socialPlatform.entities.Comment;
import com.clarivate.socialPlatform.services.CommentService;
import com.google.j2objc.annotations.Property;

public class ViewComment {
	 @Inject
	    private CommentService commentDAO;

	    @Property
	    private Comment comment;

	    public List<Comment> getComments() {
	        return commentDAO.getComments();
	    }
}
