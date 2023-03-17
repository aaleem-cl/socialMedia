package com.clarivate.socialPlatform.services.serviceimpl;

import java.util.Optional;

import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.clarivate.socialPlatform.entities.UserCreation;
import com.clarivate.socialPlatform.services.SocialMediaService;
import org.hibernate.query.*;

public class SocialMediaServiceImpl implements SocialMediaService {

	@Inject
	private Session session;

	@Log
	public boolean validate(String email, String password) {
		String query = "from UserCreation where email=:mail and password=:pswd";
		Session sc = session.getSessionFactory().openSession();
		Query<UserCreation> userQuery = sc.createQuery(query);
		System.out.println("userQuery"+userQuery);
		if(userQuery != null) {
			userQuery = userQuery.setParameter("mail", email);
			userQuery = userQuery.setParameter("pswd", password);
			Optional<UserCreation> user = userQuery.uniqueResultOptional();
			if (user.isPresent()) {
				return true;
			}
		}
		return false;
	}

}
