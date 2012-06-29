/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.people;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author kiel
 */
@Entity
@Table(name="people")
public class People implements Serializable{
        private Long id;
        private String name;
        private String password;

    @Column(name="name")
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Column(name="password")
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Id
    @GeneratedValue
    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }
    
}
