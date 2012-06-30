/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.service.people;

import com.mti.people.People;
import com.mti.people.Peoples;
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
    @GET
    @Path("/persist/{name}/{pass}")
    public void persist(@WebParam(name="name") @PathParam("name") String name, @WebParam(name="pass") @PathParam("pass") String pass);
    
    @WebMethod(operationName="remove")
    @GET
    @Path("/remove/{ID}")
    public void remove(@WebParam(name="ID") @PathParam("ID") Long id);

    @WebMethod(operationName="merge")
    @GET
    @Path("/merge/{ID}/{name}/{pass}")
    public void merge(@WebParam(name="ID") @PathParam("ID") Long id, @WebParam(name="name") @PathParam("name") String name, @WebParam(name="pass") @PathParam("pass") String pass);

    @WebMethod(operationName="findAll")
    @GET
    @Path("/findAll")
    public Peoples findAll();    

    @WebMethod(operationName="findByName")
    @GET
    @Path("/findByName/{name}")
    public People findByName(@WebParam(name="name") @PathParam("name") String s);

    @WebMethod(operationName="findByID")
    @GET
    @Path("/findByID/{id}")
    public People findByID(@WebParam(name="id") @PathParam("id") Long i);

}
