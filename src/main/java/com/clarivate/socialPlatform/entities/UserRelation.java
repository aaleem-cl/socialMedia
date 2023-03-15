package com.clarivate.socialPlatform.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_relations")
public class UserRelation {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	@Column(name="friend_id")
	private int friend_id;
	public UserRelation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRelation(int user_id, int friend_id) {
		super();
		this.user_id = user_id;
		this.friend_id = friend_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getFriend_id() {
		return friend_id;
	}
	public void setFriend_id(int friend_id) {
		this.friend_id = friend_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(friend_id, user_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRelation other = (UserRelation) obj;
		return friend_id == other.friend_id && user_id == other.user_id;
	}
	
	
}
