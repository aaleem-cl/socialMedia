package com.clarivate.socialPlatform.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.beaneditor.NonVisual;

@Entity()
public class Post
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public Long postId;
//	@Column(name="user_id")
//	public int userId;
	@Column(name="post_description")
	@Persist
	public String postDescription  ;
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getPostDescription() {
		return postDescription;
	}
	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}
	
}


