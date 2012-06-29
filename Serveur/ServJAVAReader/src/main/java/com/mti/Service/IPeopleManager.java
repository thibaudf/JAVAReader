/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service;

import com.mti.people.People;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;

/**
 *
 * @author kiel
 */
@WebService
@Path("/people/")
public interface IPeopleManager {
    	
    
    @WebMethod(operationName="persist")
    @POST
    @Path("/persist")
    public void persist(People people);
    
    @WebMethod(operationName="remove")
    @POST
    @Path("/remove")
    public void remove(People people);

    @WebMethod(operationName="merge")
    @PUT
    @Path("/merge")
    public void merge(People people);

    @WebMethod(operationName="findAll")
    @GET
    @Path("/findAll")
    public List<People> findAll();    

    @WebMethod(operationName="findByName")
    @GET
    @Path("/findByName")
    public People findByName(String s);

}
