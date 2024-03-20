package com.ExpDto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExpDto2")
public class ExpDto2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String userid;
	private String userpass;
	private String useremail;
	private String address;
	private String sex;
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserpass() {
		return userpass;
	}
	
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	public String getUseremail() {
		return useremail;
	}
	
	
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}