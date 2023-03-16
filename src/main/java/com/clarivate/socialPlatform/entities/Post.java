package com.clarivate.socialPlatform.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.beaneditor.NonVisual;

@Entity
@Table(name="post")
public class Post
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public Long postId;

	@Column(name="post_description")
	@Persist
	public String postDescription  ;
	@Required
	@ManyToOne(cascade=CascadeType.ALL)  
	//@JoinColumn(name="user_id")
	private UserCreation userCreation; 
	@NonVisual
	public Integer userId=userCreation.getUserId();
	
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


