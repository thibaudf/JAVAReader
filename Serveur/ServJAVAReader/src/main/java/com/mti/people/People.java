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
        private String login;
        private String fullname;

    @Column(name="fullname")
    public String getFullname() {
	return fullname;
    }

    public void setFullname(String fullname) {
	this.fullname = fullname;
    }

    @Column(name="login")
    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
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
