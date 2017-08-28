package edu.spring.mod4.hib.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.mod4.hib.beans.HibUser;

@Transactional
@Repository
public class HibUserDao {
	
	public HibernateTemplate hibTemplate;
	public HibernateTransactionManager transactionManager;
	public HibernateTransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
	public void insertUser(HibUser user){
		hibTemplate.getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.AUTO);
		hibTemplate.persist(user);
	}
	
	@Transactional(readOnly=true)
	public List<HibUser> getAllUsers(){
		String userQuery ="Select UserName,FirstName,LastName from HibUser";
		List<HibUser> allUsers = new ArrayList<HibUser>();
		allUsers.addAll((Collection<? extends HibUser>) hibTemplate.find(userQuery, new Object[0]));
		return allUsers;
	}
	
}