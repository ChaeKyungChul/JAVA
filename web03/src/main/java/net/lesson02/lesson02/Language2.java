package net.lesson02.lesson02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Language
 */

@WebServlet("/Language2")
public class Language2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		String[] langs = request.getParameterValues("Lang");  // getParameterValues 硫붿냼�뱶 �궗�슜

		for (int i = 0; i < langs.length; i++ ) {
			out.print("Lang: " + langs[i] + "<br>");  // �삤�� �닔�젙 諛� <br> �깭洹� �닔�
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
