package com.clarivate.socialPlatform.pages;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.InjectPage;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.UserCreation;

public class CreateUser {
	@Property
	private UserCreation userCreation;
	@Inject
	private Session session;
	@InjectPage
	private Index index;
	@Inject
	private AlertManager alertManager;
	@InjectPage
	private CreateUser createUser;

	@CommitAfter
	Object onSuccess() {
		try {
			session.persist(userCreation);
			alertManager.success("User created!");
		}catch(Exception ex) {
			alertManager.error("User not created, please try again!");
			return createUser;
		}
		return index;
	}

}
