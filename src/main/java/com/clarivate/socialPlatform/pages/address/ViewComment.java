package com.clarivate.socialPlatform.pages.address;

import java.util.List;

import javax.inject.Inject;

import org.apache.tapestry5.annotations.Property;

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
