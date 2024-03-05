package com.secondwep;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description ="두번째 서블릿", urlPatterns={"/sservlet", "/ssv"})
public class secondServlet extends HttpServlet {
	
	//메소드
	public void init() throws ServletException{
		System.out.println("init에서 실행됨");
	}
	protected void deGet(HttpServletRequest req, HttpServletResponse res)
						 throws ServletException, IOException{
		System.out.println("doGet 메서드가 실행되엇습니다.");
	}
		
}
