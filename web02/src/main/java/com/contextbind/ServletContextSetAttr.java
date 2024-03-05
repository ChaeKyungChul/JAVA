package com.contextbind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scs")
public class ServletContextSetAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	      
	        res.setContentType("text/html;charset=utf-8");
	        ServletContext context = getServletContext();
	        
	        List person = new ArrayList();
	          person.add("이순신");
	          person.add("선조");
	          person.add("권율");
	          person.add("한국인");
	          
	          //context에 값을 담음
	          context.setAttribute("person", person);
	          context.setAttribute("addr", "김포");

	}
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
