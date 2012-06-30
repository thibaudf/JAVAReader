/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.people.People;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	    System.out.println("database failure" + re.getMessage());
	}
    }

    @Override
    public void remove(People people)
    {
	try {
	    People p = entityManager.find(People.class,people.getId());
	    entityManager.remove(p);
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	}
    }
    
    @Override
    public void merge(People people)
    {
	try {
		entityManager.merge(people);
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
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
	    System.out.println("database failure" + re.getMessage());
	    return new ArrayList<People>();
	}
    }
    
    @Override
    public People findByName(String s)
    {
	try {
	    Query query = entityManager.createQuery("select p from People p where p.name like :name");
	    query.setParameter("name", s);
	    People p = (People) query.getSingleResult();
	    return p;
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return null;
	}
    }

    @Override
    public People findByID(Long i)
    {
	try {
	    Query query = entityManager.createQuery("select p from People p where p.id like :id");
	    query.setParameter("id", i);
	    People p = (People) query.getSingleResult();
	    return p;
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return null;
	}
    }

}
