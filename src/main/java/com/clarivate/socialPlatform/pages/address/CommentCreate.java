package com.clarivate.socialPlatform.pages.address;

import javax.inject.Inject;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.Comment;
import com.clarivate.socialPlatform.entities.Post;
import com.clarivate.socialPlatform.pages.Index;


public class CommentCreate {
	 @Inject
	private Session session;
	 @Property
	 private Long postId;
	 @Property
	 private String content;
	 @CommitAfter
	@OnEvent(value = EventConstants.SUCCESS, component = "commentForm")
	 public Object createComment() {
	 Post post = session.get(Post.class, postId);
	  Comment comment = new Comment();
	 comment.setPost(post);
	  comment.setContent(content);
	  session.persist(comment);
	 return Index.class;
	}
}
