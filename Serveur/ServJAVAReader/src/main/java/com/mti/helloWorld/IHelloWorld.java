/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.helloWorld;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author kiel
 */
@WebService
@Path("/")
public interface IHelloWorld {
    @WebMethod(operationName="hello")
    @GET
    @Path("/sayHello/{text}")
    String sayHello(@PathParam(value = "text") @WebParam(name="text") String text);
    
}
