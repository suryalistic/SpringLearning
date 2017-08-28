package com.springmvcsechib.spv.configuration;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;

import com.springmvcsechib.spv.dao.AbstractDao;
import com.springmvcsechib.spv.model.PersistenLogins;

@Repository("tokenRepositoryDao")
@Transactional
public class HibernateTokenRepositoryImpl extends AbstractDao<String, PersistenLogins> implements PersistentTokenRepository {
	Logger logger = LoggerFactory.getLogger(HibernateTokenRepositoryImpl.class);
	@Override
	public void createNewToken(PersistentRememberMeToken token) {
		logger.info("Creating Token for user : {}", token.getUsername());
		PersistenLogins persistentLogin = new PersistenLogins();
        persistentLogin.setUsername(token.getUsername());
        persistentLogin.setSeries(token.getSeries());
        persistentLogin.setToken(token.getTokenValue());
        persistentLogin.setLastused(token.getDate());
        persist(persistentLogin);
 
	}

	@Override
	public PersistentRememberMeToken getTokenForSeries(String series) {
		CriteriaQuery<PersistenLogins> cq = createCriteriaQuery();
		CriteriaBuilder cb = getCriteriaBuilder();
		EntityManager em = createEntityManager();
		Root<PersistenLogins> fromPersistenLogins = cq.from(PersistenLogins.class);
		ParameterExpression<String> exp = cb.parameter(String.class, series);
		Predicate p = cb.equal(fromPersistenLogins.get("series"), series);
		cq.select(fromPersistenLogins).where(p);
		TypedQuery<PersistenLogins> quer = em.createQuery(cq);
		List<PersistenLogins> logins = quer.getResultList();
		if(logins.isEmpty()){
			return null;
		}
		PersistentRememberMeToken remMe =new PersistentRememberMeToken(logins.get(0).getUsername(), logins.get(0).getSeries(), 
				logins.get(0).getToken(), logins.get(0).getLastused());
 		return remMe;
	}

	@Override
	public void removeUserTokens(String userName) {
		CriteriaQuery<PersistenLogins> cq = createCriteriaQuery();
		CriteriaBuilder cb = getCriteriaBuilder();
		EntityManager em = createEntityManager();
		Root<PersistenLogins> fromPersistenLogins = cq.from(PersistenLogins.class);
		ParameterExpression<String> param = cb.parameter(String.class, userName);
		Predicate p = cb.equal(fromPersistenLogins.get("username"),userName);
		cq.select(fromPersistenLogins).where(p);
		TypedQuery<PersistenLogins> tq = em.createQuery(cq);
		List<PersistenLogins> logins = tq.getResultList();
		delete(logins.get(0));
	}

	@Override
	public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
//		PersistenLogins login =
	}

}
