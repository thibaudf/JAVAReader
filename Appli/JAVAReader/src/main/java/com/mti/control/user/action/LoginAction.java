/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mti.control.user.action;
 
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Namespace("/User")
@ResultPath(value="/")
@Result(name="success",location="pages/login.jsp")
public class LoginAction extends ActionSupport{
 
}