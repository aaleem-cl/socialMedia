//package com.clarivate.socialPlatform.components;
//
//
//import java.util.List;
//
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//
//import org.apache.tapestry5.annotations.InjectPage;
//import org.apache.tapestry5.annotations.Property;
//import org.apache.tapestry5.hibernate.annotations.CommitAfter;
//
//import com.clarivate.socialPlatform.entities.Comment;
//import com.clarivate.socialPlatform.entities.Post;
//public class PostList {
//@Inject
//private EntityManager entityManager;
//@Property
//private List<Post> posts;
//@InjectPage
//private Comment addCommentPage;
//void setupRender() {
//// retrieve all posts from the database
//posts = entityManager.createQuery("SELECT p FROM Post p", Post.class).getResultList();
//    }
// @CommitAfter
//void onCommentSubmitted(Long postId, String content) {
// // create a new comment entity and associate it with the corresponding post
// Post post = entityManager.find(Post.class, postId);
// Comment comment = new Comment();
// comment.setContent(content);
// comment.setPost(post);
// post.getComments().add(comment);
// entityManager.persist(comment);
//    }
//public Comment getAddComment() {
//return addCommentPage;
//    }
//}
