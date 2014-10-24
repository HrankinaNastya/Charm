package org.hillel.it.charm.persistence.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hillel.it.charm.model.entity.Category;
import org.hillel.it.charm.model.entity.User;
import org.hillel.it.charm.persistence.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addUser(User user) {
		em.persist(user);
	}

	@Override
	@Transactional(readOnly=true)
	public User getUser(int id) {
		return em.find(User.class, id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> getUsers() {
		return em.createNamedQuery(User.GET_USERS, 
				User.class).getResultList();
	}

	@Override
	public <T> List<T> getUsersByCategory(Class<T> choice, 
			Category category) {
		TypedQuery<T> query = em.createNamedQuery(
				User.GET_USERS_BY_CATEGORY, choice);
		query.setParameter("category", category.name());
		return query.getResultList();
	}

	@Override
	public void deleteUser(int id) {
		Query query = em.createNamedQuery(User.DELETE_USER);
		query.setParameter("id", id);
	}

	@Override
	public void deleteUsers() {
		em.createNamedQuery(User.DELETE_USERS);
	}

}
