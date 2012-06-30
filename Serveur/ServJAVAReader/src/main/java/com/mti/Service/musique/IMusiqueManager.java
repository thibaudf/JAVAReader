/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service.musique;

import com.mti.musique.Musique;
import com.mti.musique.Musiques;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;

/**
 *
 * @author kiel
 */
@WebService
@Path("/musique/")
public interface IMusiqueManager {
    @WebMethod(operationName="persist")
    @GET
    @Path("/persist/{name}/{artiste}/{song}/{peopleID}")
    public void persist(@WebParam(name="name") @PathParam("name") String name, 
			@WebParam(name="artiste") @PathParam("artiste") String artiste,
			@WebParam(name="song") @PathParam("song") String song,
			@WebParam(name="peopleID") @PathParam("peopleID") Long peopleID);
    
    @WebMethod(operationName="remove")
    @GET
    @Path("/remove/{ID}")
    public void remove(@WebParam(name="ID") @PathParam("ID") Long id);

    @WebMethod(operationName="merge")
    @GET
    @Path("/merge/{ID}/{name}/{artiste}/{song}/{peopleID}")
    public void merge(@WebParam(name="ID") @PathParam("ID") Long id, 
			@WebParam(name="name") @PathParam("name") String name, 
			@WebParam(name="artiste") @PathParam("artiste") String artiste,
			@WebParam(name="song") @PathParam("song") String song,
			@WebParam(name="peopleID") @PathParam("peopleID") Long peopleID);

    @WebMethod(operationName="findAll")
    @GET
    @Path("/findAll")
    public Musiques findAll();    

    @WebMethod(operationName="findByName")
    @GET
    @Path("/findByName/{name}")
    public Musiques findByName(@WebParam(name="name") @PathParam("name") String s);

    @WebMethod(operationName="findByArtiste")
    @GET
    @Path("/findByArtiste/{name}")
    public Musiques findByArtiste(@WebParam(name="name") @PathParam("name") String s);
    
    @WebMethod(operationName="findByPeopleID")
    @GET
    @Path("/findByPeopleID/{ID}")
    public Musique findByPeopleID(@WebParam(name="ID") @PathParam("ID") Long id);
}
