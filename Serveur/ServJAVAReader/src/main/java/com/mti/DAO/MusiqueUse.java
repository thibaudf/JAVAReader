/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.musique.Musique;
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
@Repository("MusiqueUseInterface")
public class MusiqueUse implements MusiqueUseInterface {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Musique musique)
    {
	try {
	    entityManager.persist(musique);
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	}
    }

    @Override
    public void remove(Musique musique)
    {
	try {
	    Musique m = entityManager.find(Musique.class,musique.getId());
	    entityManager.remove(m);
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	}
    }
    
    @Override
    public void merge(Musique musique)
    {
	try {
	    entityManager.merge(musique);
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	}
    }
    
    @Override
    public List<Musique> findAll()
    {
	try {
	    Query query = entityManager.createQuery("SELECT p FROM Musique p");
	    List<Musique> userList = (List<Musique>) query.getResultList();
	    return userList;
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return new ArrayList<Musique>();
	}
    }
    
    @Override
    public List<Musique> findByName(String s)
    {
	try {
	    Query query = entityManager.createQuery("select p from Musique p where p.name like :name");
	    query.setParameter("name", s);
	    List<Musique> userList = (List<Musique>) query.getResultList();
	    return userList;
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return new ArrayList<Musique>();
	}
    }

    @Override
    public List<Musique> findByArtiste(String s)
    {
	try {
	    Query query = entityManager.createQuery("select p from Musique p where p.artiste like :artiste");
	    query.setParameter("artiste", s);
	    List<Musique> userList = (List<Musique>) query.getResultList();
	    return userList;
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return new ArrayList<Musique>();
	}
    }

    @Override
    public Musique findByPeopleID(Long id)
    {
	try {
	    Query query = entityManager.createQuery("select p from Musique p where p.peopleID like :id");
	    query.setParameter("id", id);
	    return (Musique) query.getSingleResult();
	} catch (RuntimeException re) {
	    System.out.println("database failure" + re.getMessage());
	    return null;
	}
    }

}
