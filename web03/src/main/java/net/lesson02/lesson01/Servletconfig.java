package net.lesson02.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletconfig
 */

/*
@WebServlet(
		description = "기본파라미터지정", 
		urlPatterns = { "/Servletconfig" }, 
		initParams = { 
				@WebInitParam(name = "Username", value = "홍길동", description = "유저가 받는이름"), 
				@WebInitParam(name = "Userofice", value = "도둑주식회사", description = "홍길동회사")
		})
		*/
public class Servletconfig extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	
	
	
	//	
	String name = getInitParameter("username");
	String company = getInitParameter("useroffice");
	
	out.print(name +" :메롱" + company);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
