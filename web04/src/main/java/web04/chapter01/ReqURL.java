package web04.chapter01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reqURL")
public class ReqURL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html;charset=utf-8");
	  PrintWriter out = response.getWriter();
	  
	  out.println("요청 URI : " + request.getRequestURI()+ "<br>" );
	  out.println("요청 URL : " + request.getRequestURL()+ "<br>");
	  out.println("쿼리스트림 : " + request.getQueryString()+ "<br>");
	  out.println("Context 경로 : " + request.getContextPath()+ "<br>");
	  out.println("서블릿 경로 : " + request.getServletPath()+ "<br>");
	  
	  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
