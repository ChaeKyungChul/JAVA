package com.Fourweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fourthServlet")
public class FourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out = response.getWriter();
	      
	      //서블릿 콘텍스트를 정보를 가져옴
	      /*
	       * getServletContext() 메소드를 이용해 ServletContext의 객체를 얻어옴.
	       * getInitParameter() 메소드를 사용해 값을 반환 받음.
	       */
	      ServletContext context = this.getServletContext();
	      String uname = context.getInitParameter("uname");
	      String uoffice = context.getInitParameter("uoffice");
	            
	      out.print(uname + " : " + uoffice);
	      out.print("<br><br>");
	      
	      //ServletContext 이름 전체에 추출하는 방법
	      Enumeration<String> paramNames = context.getInitParameterNames();
	      
	      while(paramNames.hasMoreElements()) {
	    	  String name = paramNames.nextElement();
	    	  String value = context.getInitParameter(name);
	    	  out.print(name + " : " + value + "<br>");
	      }
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}