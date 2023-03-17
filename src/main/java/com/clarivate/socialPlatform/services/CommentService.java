package com.clarivate.socialPlatform.services;

import java.util.List;

import com.clarivate.socialPlatform.entities.Comment;

public interface CommentService {
	void addComment(Comment comment);
	List<Comment> getComments();
	void refresh();
}
