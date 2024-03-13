package web04.chapter01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/res")
public class Servletres extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		int number = Integer.parseInt(request.getParameter("num"));
		String user = request.getParameter("user");
	
	
		out.print("학번 : " + number + "<br>");
		out.print("이름 : " + user +  "<br>");
		
		//방법밑에 3개 보내는것   스크립트 , addheader->학번이름나옴, send바로보내는것->포워딩으로이루어진창
		//response.sendRedirect("nservlet");            1번방법    
		//response.addHeader("Refresh", "3;url=nservlet"); 2번방법
		//String script = "<script> alert(\"이동합니다.!!\"); location.href='nservlet'; </script>";
		//out.print(script);  3번방법
		RequestDispatcher dis = request.getRequestDispatcher("nservlet");
		dis.forward(request,  response);
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
