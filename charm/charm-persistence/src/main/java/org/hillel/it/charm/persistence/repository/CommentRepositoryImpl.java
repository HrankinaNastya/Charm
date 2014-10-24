package org.hillel.it.charm.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.User;
import org.hillel.it.charm.persistence.CommentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addComment(Comment comment) {
		em.persist(comment);
	}

	@Override
	public Comment getComment(int id) {
		return em.find(Comment.class, id);
	}

	@Override
	public List<Comment> getComments(User user) {
		TypedQuery<Comment> query = em.createNamedQuery(
				Comment.GET_COMMENT_BY_USER_ID, Comment.class);
		query.setParameter("id", user.getId());
		return query.getResultList();
	}

	@Override
	public List<Comment> getComments(Product product) {
		TypedQuery<Comment> query = em.createNamedQuery(
				Comment.GET_COMMENT_BY_PRODUCT_ID, 
				Comment.class);
		query.setParameter("id", product.getId());
		return query.getResultList();
	}

	@Override
	public List<Comment> getComments() {
		return em.createNamedQuery(
				Comment.GET_COMMENTS, Comment.class).getResultList();
	}

	@Override
	public void deleteComment(int id) {
		Query query = em.createNamedQuery(Comment.DELETE_COMMENT_BY_ID);
		query.setParameter("id", id);
	}

	@Override
	public void deleteComments(User user) {
		Query query = em.createNamedQuery(
				Comment.DELETE_COMMENT_BY_USER_ID);
		query.setParameter("id", user.getId());
	}

	@Override
	public void deleteComments(Product product) {
		Query query = em.createNamedQuery(
				Comment.DELETE_COMMENT_BY_PRODUCT_ID);
		query.setParameter("id", product.getId());
	}

	@Override
	public void deleteComments() {
		em.createNamedQuery(Comment.DELETE_COMMENTS);
	}

}
