package com.clarivate.socialPlatform.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String content;
@ManyToOne
 @JoinColumn(name = "post_id")
private Post post;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Post getPost() {
	return post;
}
public void setPost(Post post) {
	this.post = post;
}
}
