/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.people;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kiel
 */
@XmlRootElement(name="peoples")
public class Peoples {
    
    private List<People> peoples;
    
    public Peoples() {
	super();
    }
    
    public Peoples(List<People> source) {
	super();
	peoples = source;
    }

    public List<People> getPeoples() {
	return peoples;
    }

    public void setPeoples(List<People> peoples) {
	this.peoples = peoples;
    }
    
}
