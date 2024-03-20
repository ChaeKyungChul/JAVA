package com.loginservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginService
 */
@WebServlet("/loginservice")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); // request로 받은 값을 utf-8로 인코딩
		
		String userid = request.getParameter("id"); //getParameter를 이용해 request 받음
		String userpass = request.getParameter("password");
		MemberService m1 = new MemberService();
		
		
		
	
		response.setContentType("text/html;charset=UTF-8"); //페이지에 보여질 화면을 utf-8형식으로 인코딩
		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
		out.println("</head>");
		if(m1.login(userid, userpass)) {
	        out.println("<body><h1>로그인 되었습니다.</h1>");
	        out.println("<button onclick='logout()'><a href='login.html'>로그아웃</button>");
	        out.println("<script>");      
            out.println("function logout(){");      
            out.println("alert('로그아웃 되었습니다.')");      
            out.println("history.back();}");     
            out.println("</script>");

		}else {
			out.println("<body>");
			out.println("<script>");
	        out.println("alert('id 또는 password가 올바르지 않습니다.')");      
	        out.println("history.back();");     
	        out.println("</script>");
		}
		out.println("</body></html>");
		
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
