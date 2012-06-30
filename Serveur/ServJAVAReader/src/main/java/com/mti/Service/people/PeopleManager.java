/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service.people;

import com.mti.DAO.PeopleUseInterface;
import com.mti.people.People;
import com.mti.people.Peoples;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kiel
 */
@Service("peopleManager")
@Transactional(propagation= Propagation.REQUIRED, readOnly = true)
@WebService(endpointInterface="com.mti.service.people.IPeopleManager")
public class PeopleManager implements IPeopleManager{


    @Autowired
    private PeopleUseInterface peopleUse;

    @Override
    @Transactional(readOnly = false)
    public void persist(String name, String pass) {
	People people = new People();
	people.setName(name);
	people.setPassword(pass);
	peopleUse.persist(people);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
	People people = new People();
	people.setId(id);
	peopleUse.remove(people);
    }

    @Override
    @Transactional(readOnly = false)
    public void merge(Long id, String name, String pass) {
	People people = new People();
	people.setName(name);
	people.setPassword(pass);
	people.setId(id);
	peopleUse.merge(people);
    }

    @Override
    public Peoples findAll() {
	return new Peoples(peopleUse.findAll());
    }

    @Override
    public People findByName(String s) {
	return peopleUse.findByName(s);
    }

    @Override
    public People findByID(Long i) {
	return peopleUse.findByID(i);
    }

}
