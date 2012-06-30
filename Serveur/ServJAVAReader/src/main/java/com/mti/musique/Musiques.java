/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.musique;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kiel
 */
@XmlRootElement(name="musiques")
public class Musiques {
    private List<Musique> musiques;
    
    public Musiques() {
	super();
    }
    
    public Musiques(List<Musique> source) {
	super();
	musiques = source;
    }

    public List<Musique> getMusiques() {
	return musiques;
    }

    public void setMusiques(List<Musique> musiques) {
	this.musiques = musiques;
    }
    
}
