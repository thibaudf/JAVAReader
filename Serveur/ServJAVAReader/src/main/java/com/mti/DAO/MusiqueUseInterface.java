/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.DAO;

import com.mti.musique.Musique;
import java.util.List;

/**
 *
 * @author kiel
 */
public interface MusiqueUseInterface {
    public void persist(Musique musique);
    public void remove(Musique musique);
    public void merge(Musique musique);
    public List<Musique> findAll();
    public List<Musique> findByName(String s);
    public List<Musique> findByArtiste(String s);
    public Musique findByPeopleID(Long id);
}
