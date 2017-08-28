package com.springmvcsechib.spv.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import com.springmvcsechib.spv.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements IUserDao {

	@Override
	public User findById(Integer id) {
		User userById = findById(id);
		if(userById != null){ 
//			lazy intialize the user profiles, many to many relation
			Hibernate.initialize(userById.getUserProfiles());
		}
		return userById;
	} 

	@Override
	public User findBySSO(String sso) {
		CriteriaQuery<User> cq = createCriteriaQuery();
		Root<User> fromUser = cq.from(User.class);
		ParameterExpression<String> exp = getCriteriaBuilder().parameter(String.class);
		cq.select(fromUser).where(getCriteriaBuilder().equal(fromUser.get("sso"),sso ));
		EntityManager em = getSession().getEntityManagerFactory().createEntityManager();
		TypedQuery<User> typedUserQuery = em.createQuery(cq);
		typedUserQuery.setParameter(exp, sso);
		List<User> users = typedUserQuery.getResultList();
		if(!users.isEmpty() && users.size() == 1){
			return users.get(0);
		}
		return null;
	}

	@Override
	public void save(User user) {
		persist(user);
	}

	@Override
	public void deleteBySSO(String sso) {
		CriteriaQuery<User> cq= createCriteriaQuery();
		Root<User> fromUser = cq.from(User.class);
		ParameterExpression<String> exp = getCriteriaBuilder().parameter(String.class);
		Predicate p  = getCriteriaBuilder().equal(fromUser.get("sso"), sso);
		EntityManager em = createEntityManager();
		cq.select(fromUser).where(p);
		TypedQuery<User> userQuery = em.createQuery(cq);
		userQuery.setParameter(exp, sso);
		List<User> users = userQuery.getResultList();
		if(!users.isEmpty() && users.size() == 1){
			delete(users.get(0));
		}
	}

	@Override
	public List<User> findAllUsers() {
		CriteriaQuery<User> cq = createCriteriaQuery();
		Root<User> fromUser = cq.from(User.class);
		EntityManager em = createEntityManager();
		cq.select(fromUser);
		TypedQuery<User> tq = em.createQuery(cq);
		List<User> users = tq.getResultList();
		if(!users.isEmpty()){
			return users;
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		update(user);
	}

}
