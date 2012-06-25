/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.people.People;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kiel
 */
public class PeopleUse implements PeopleUseInterface{

    @PersistenceContext private EntityManager entityManager;
    
    public void persist(People people)
    {
	//add
    }

    public void remove(People people)
    {
	
    }
    
    public void merge(People people)
    {
	//updage
    }
    
    public List<People> findAll()
    {
	return null;
    }
    
    public People findByLogin(String s)
    {
	return null;
    }
}
