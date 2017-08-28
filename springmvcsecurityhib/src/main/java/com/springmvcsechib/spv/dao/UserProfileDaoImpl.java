package com.springmvcsechib.spv.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.springmvcsechib.spv.model.UserProfile;

@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile> implements IUserProfileDao {

	@Override
	public List<UserProfile> findAll() {
		CriteriaQuery<UserProfile> cq = createCriteriaQuery();
		Root<UserProfile> fromUserProfile = cq.from(UserProfile.class);
		EntityManager em = createEntityManager();
//		CriteriaBuilder cb = getCriteriaBuilder();
		cq.select(fromUserProfile);
		TypedQuery<UserProfile> tq = em.createQuery(cq);
		List<UserProfile> userProfiles = tq.getResultList();
		return userProfiles;
	}

	@Override
	public UserProfile findByType(String type) {
		CriteriaQuery<UserProfile> cq = createCriteriaQuery();
		CriteriaBuilder cb = getCriteriaBuilder();
		EntityManager em = createEntityManager();
		Root<UserProfile> fromUserProfile = cq.from(UserProfile.class);
		ParameterExpression<String> exp = cb.parameter(String.class, type);
		Predicate p = cb.equal(fromUserProfile.get("type"),type );
		cq.select(fromUserProfile).where(p);
		TypedQuery<UserProfile> tq = em.createQuery(cq);
		tq.setParameter(exp, type);
		List<UserProfile> userProfiles = tq.getResultList();
		if(!userProfiles.isEmpty() && userProfiles.size() == 1){
			return userProfiles.get(0);
		}
		return null;
	}

	@Override
	public UserProfile findById(Integer id) {
		UserProfile userProfile = findById(id);
		return userProfile;
	}

}
