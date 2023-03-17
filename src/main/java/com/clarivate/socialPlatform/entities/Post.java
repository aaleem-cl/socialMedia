package com.clarivate.socialPlatform.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.beaneditor.NonVisual;

@Entity
@Table(name="post")
public class Post
{
	@Id
	@Column(name = "post_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public Long postId;

	@Column(name="post_description")
	@Persist
	public String postDescription  ;
	public Long getPostId() {
		return postId;
	}
//	@ManyToOne(cascade=CascadeType.ALL)
//	private UserCreation userCreation;
	
	
	
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


