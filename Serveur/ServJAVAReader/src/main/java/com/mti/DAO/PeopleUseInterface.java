/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.people.People;
import java.util.List;

/**
 *
 * @author kiel
 */
public interface PeopleUseInterface {
    public void persist(People people);
    public void remove(People people);
    public void merge(People people);
    public List<People> findAll();    
    public People findByLogin(String s);
    
}
