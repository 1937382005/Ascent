package com.ascent.util;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class jmyz  extends   Authenticator {
	 String username = null;   
	 String password = null;   
	 public PasswordAuthentication performCheck(String user,String pass){   
	          username = user;   
	          password = pass;   
	          return getPasswordAuthentication();   
	 }   
	@Override
	protected PasswordAuthentication getPasswordAuthentication(){
	          return new PasswordAuthentication(username,password);   
	}   

}
