/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.people.People;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kiel
 */
@Repository("PeopleUseInterface")
public class PeopleUse implements PeopleUseInterface{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(People people)
    {
	try {
			entityManager.persist(people);
		} catch (RuntimeException re) {
		}
    }

    @Override
    public void remove(People people)
    {
	try {
			entityManager.remove(people);
		} catch (RuntimeException re) {
		}
    }
    
    @Override
    public void merge(People people)
    {
	try {
			entityManager.merge(people);
		} catch (RuntimeException re) {
		}
    }
    
    @Override
    public List<People> findAll()
    {
	try {
		Query query = entityManager.createQuery("SELECT p FROM People p");
		List<People> userList = (List<People>) query.getResultList();
		return userList;
	} catch (RuntimeException re) {
		return new ArrayList<People>();
	}
    }
    
    @Override
    public People findByName(String s)
    {
		try {
			Query query = entityManager.createQuery("select p from people p where p.name like :name");
			query.setParameter("name", s);
			People p = (People) query.getSingleResult();
			return p;
		} catch (RuntimeException re) {
			return null;
		}
    }
}
