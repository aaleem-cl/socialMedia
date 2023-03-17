package com.clarivate.socialPlatform.services.serviceimpl;

import com.clarivate.socialPlatform.entities.Comment;
import com.clarivate.socialPlatform.services.CommentService;
import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
public class CommentServiceImpl implements CommentService {


	 @Inject
	    private Session session;

	    private List<Comment> comments;
	    
	    @Override
	    public void addComment(Comment comment) {
	        session.persist(comment);
	        refresh();
	    }

	    @Override
	    public List<Comment> getComments() {
	        if (comments == null) {
	            refresh();
	        }
	        return comments;
	    }

	    @Override
	    public void refresh() {
	        comments = session.createCriteria(Comment.class).list();
	    }
	
	}





































//package com.clarivate.socialPlatform.services.serviceimpl;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.hibernate.Session;
//
//import com.clarivate.socialPlatform.entities.Comment;
//import com.clarivate.socialPlatform.services.CommentService;
//
//public class CommentServiceImpl implements CommentService {
//
//	@Inject
//	private Session session;
//	private List<Comment> comments;
//
//	@Override
//	public void addComment(Comment comments) {
//	session.persist(comments);
//	refresh();
//	         }
//
//	@Override
//	 public List<Comment> getComments() {
//	if (comments == null) {
//	refresh();
//	 }
//	return comments;
//	         }
//
//	@Override
//	public void refresh() {
//		comments = session.createCriteria(Comment.class).list();
//
//	}
//
//
//}
