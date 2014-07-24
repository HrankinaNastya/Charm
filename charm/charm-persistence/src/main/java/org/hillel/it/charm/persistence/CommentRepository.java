package org.hillel.it.charm.persistence;

import java.util.List;

import org.hillel.it.charm.model.entity.Comment;
import org.hillel.it.charm.model.entity.Person;
import org.hillel.it.charm.model.entity.Product;

public interface CommentRepository {
	
	public void addComment(Comment comment);
	
	public Comment getComment(int id);
	public List<Comment> getComments(Person user);
	public List<Comment> getComments(Product product);
	public List<Comment> getComments();
	
	public void deleteComment(int id);
	public void deleteComments(Person user);
	public void deleteComments(Product product);

}
