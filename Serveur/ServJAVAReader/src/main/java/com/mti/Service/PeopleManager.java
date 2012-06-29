/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service;

import com.mti.DAO.PeopleUseInterface;
import com.mti.people.People;
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
@WebService(endpointInterface="com.mti.service.IPeopleManager")
public class PeopleManager implements IPeopleManager{


    @Autowired
    private PeopleUseInterface peopleUse;

    @Override
    @Transactional(readOnly = false)
    public void persist(People people) {
	peopleUse.persist(people);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(People people) {
	peopleUse.remove(people);
    }

    @Override
    @Transactional(readOnly = false)
    public void merge(People people) {
	peopleUse.merge(people);
    }

    @Override
    public List<People> findAll() {
	return peopleUse.findAll();
    }

    @Override
    public People findByName(String s) {
	return peopleUse.findByName(s);
    }


}
