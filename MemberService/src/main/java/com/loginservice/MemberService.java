package com.loginservice;

public class MemberService {
    // login ¸Þ¼Òµå
    public boolean login(String id, String password) {
       
        if (id.equals("ezen") && password.equals("12345")) {
            return true;  
        } else {
            return false;  
        }
    }

    public boolean logout(String id) {
    	if(id.equals("ezen")) {
    		return true; 
    	}else {
    		return false;
    	}
    

    }
   }