/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.helloWorld;

import com.mti.people.People;
import javax.jws.WebService;

/**
 *
 * @author kiel
 */
@WebService(endpointInterface="com.mti.helloWorld.IHelloWorld")
public class HelloWorld implements IHelloWorld{
    private People people;

    public People getPeople() {
	return people;
    }

    public void setPeople(People people) {
	this.people = people;
    }
    
    public void hello()
    {
	System.out.print("hello ");
	System.out.print(people.getFullname());
	System.out.print(people.getLogin());
    }

    @Override
    public String sayHello(String text) {
	return "hello "+text;
    }
    

}
