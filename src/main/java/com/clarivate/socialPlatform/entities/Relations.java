package com.clarivate.socialPlatform.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tapestry5.annotations.Persist;

@Entity
@Table(name="user_relations")
public class Relations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId1")
	@Persist
	private int userId1;
	@Column(name="userId2")
	@Persist
	private int userId2;
	
	public int getUserId1() {
		return userId1;
	}
	public void setUserId1(int userId1) {
		this.userId1 = userId1;
	}
	public int getUserId2() {
		return userId2;
	}
	public void setUserId2(int userId2) {
		this.userId2 = userId2;
	}
	
		
}

