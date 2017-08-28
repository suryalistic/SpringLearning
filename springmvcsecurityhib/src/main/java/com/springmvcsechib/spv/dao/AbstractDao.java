package com.springmvcsechib.spv.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao<PKey extends Serializable, T> {

	@Autowired
	public SessionFactory sessionFactory;

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void persist(T obj){
		getSession().persist(obj);
	}
	
	public void update(T obj){
		getSession().update(obj);
	}
	
	public void delete(T obj){
		getSession().delete(obj);
	}
	
	@SuppressWarnings("unchecked")
	public CriteriaQuery<T> createCriteriaQuery(){
		return (CriteriaQuery<T>)getSession().getCriteriaBuilder().createQuery();
	}
	
	public CriteriaBuilder getCriteriaBuilder(){
		return getSession().getCriteriaBuilder();
	}
	
	public EntityManager createEntityManager(){
		return getSession().getEntityManagerFactory().createEntityManager();
	}
}
