/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.musique;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kiel
 */
@Entity
@Table(name="musique")
@XmlRootElement(name="musique")
public class Musique implements Serializable{
        private Long id;
        private String song;
	private String name;
	private String artiste;
	private Long peopleID;

    @Column(name="artiste")
    public String getArtiste() {
	return artiste;
    }

    public void setArtiste(String artiste) {
	this.artiste = artiste;
    }

    @Id
    @GeneratedValue
    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    @Column(name="name")
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Column(name="peopleID")
    public Long getPeopleID() {
	return peopleID;
    }

    public void setPeopleID(Long peopleID) {
	this.peopleID = peopleID;
    }

    @Column(name="song")
    public String getSong() {
	return song;
    }

    public void setSong(String song) {
	this.song = song;
    }
    
}