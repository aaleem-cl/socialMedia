package com.clarivate.socialPlatform.entities;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.tapestry5.beaneditor.NonVisual;

@Entity
@Table(name="post")
public class Post
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	@Column(name="post_id")
	private Long postId;
	@Column(name="post_description")
	private String postDescription;
	
	@ManyToOne
	private UserCreation userCreation;
	@Column(name="user_id")
	private long userId;
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UserCreation getUserCreation() {
		return userCreation;
	}
	public void setUserCreation(UserCreation userCreation) {
		this.userCreation = userCreation;
	}
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
	



