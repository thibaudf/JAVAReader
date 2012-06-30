/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service.musique;

import com.mti.DAO.MusiqueUseInterface;
import com.mti.musique.Musique;
import com.mti.musique.Musiques;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kiel
 */
@Service("musiqueManager")
@Transactional(propagation= Propagation.REQUIRED, readOnly = true)
@WebService(endpointInterface="com.mti.service.musique.IMusiqueManager")
public class MusiqueManager implements IMusiqueManager{


    @Autowired
    private MusiqueUseInterface musiqueUse;

    @Override
    @Transactional(readOnly = false)
    public void persist(String name, String artiste, String song, Long peopleID)
    {
	Musique musique = new Musique();
	musique.setName(name);
	musique.setArtiste(artiste);
	musique.setSong(song);
	musique.setPeopleID(peopleID);
	musiqueUse.persist(musique);
    }


    @Override
    @Transactional(readOnly = false)
    public void remove(Long id)
    {
	Musique musique = new Musique();
	musique.setId(id);
	musiqueUse.remove(musique);
    }


    @Override
    @Transactional(readOnly = false)
    public void merge(Long id, String name, String artiste, String song, Long peopleID)
    {
	Musique musique = new Musique();
	musique.setName(name);
	musique.setArtiste(artiste);
	musique.setSong(song);
	musique.setPeopleID(peopleID);
	musique.setId(id);
	musiqueUse.merge(musique);
    }

    @Override
    public Musiques findAll() {
	return new Musiques(musiqueUse.findAll());
    }

    @Override
    public Musiques findByName(String s)
    {
	return new Musiques(musiqueUse.findByName(s));
    }

    @Override
    public Musiques findByArtiste(String s)
    {
	return new Musiques(musiqueUse.findByArtiste(s));
    }

    @Override
    public Musique findByPeopleID(Long id)
    {
	return musiqueUse.findByPeopleID(id);
    }

}
