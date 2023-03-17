//package com.clarivate.socialPlatform.services.serviceimpl;
//
//import javax.inject.Inject;
//
//import org.hibernate.Session;
//
//import com.clarivate.socialPlatform.entities.Post;
//import com.clarivate.socialPlatform.entities.UserCreation;
//import com.clarivate.socialPlatform.services.ViewPostService;
//
//public class ViewPostServiceImpl implements ViewPostService {
//	@Inject
//	Session session;
//	@Inject
//	Post post;
//	@Inject
//	UserCreation userCreation;
//	//@Log
////	public Object Data(int userId) {
////		String query = "from Post where userId=:id";
////		Session sc = session.getSessionFactory().openSession();
////		Query userQuery = sc.createQuery(query);
////		System.out.println("userQuery"+userQuery);
////		if(userQuery != null) {
////			userQuery = userQuery.setParameter("id",userId );
////			List<Object[]> result = userQuery.list();	
////        
////		return null;
////	}
//	return null;
//	}
//}


