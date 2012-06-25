/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.control.user.action;
 
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/User")
@ResultPath(value="/")
public class AccueilAction extends ActionSupport{
 
	private String username;
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	@Action(value="Welcome", results={
		@Result(name=SUCCESS,location="pages/Accueil.jsp"),
		@Result(name=LOGIN,location="pages/login.jsp")
	})
    @Override
	public String execute() {
 
	    if (username.equals("test") == true)
		return SUCCESS;
	    else
		return LOGIN;
 
	}
}