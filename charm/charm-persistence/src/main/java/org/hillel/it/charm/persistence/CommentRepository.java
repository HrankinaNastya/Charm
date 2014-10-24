package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Product;
import org.hillel.it.charm.model.entity.User;

public interface CommentRepository {
	
	public void addComment(Comment comment);
	
	public Comment getComment(int id);
	public List<Comment> getComments(User user);
	public List<Comment> getComments(Product product);
	public List<Comment> getComments();
	
	public void deleteComment(int id);
	public void deleteComments(User user);
	public void deleteComments(Product product);
	public void deleteComments();
	
}
