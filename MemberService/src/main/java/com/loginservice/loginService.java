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
		
		request.setCharacterEncoding("utf-8"); // request�� ���� ���� utf-8�� ���ڵ�
		
		String userid = request.getParameter("id"); //getParameter�� �̿��� request ����
		String userpass = request.getParameter("password");
		MemberService m1 = new MemberService();
		
		
		
	
		response.setContentType("text/html;charset=UTF-8"); //�������� ������ ȭ���� utf-8�������� ���ڵ�
		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>�α���</title>");
		out.println("</head>");
		if(m1.login(userid, userpass)) {
	        out.println("<body><h1>�α��� �Ǿ����ϴ�.</h1>");
	        out.println("<button onclick='logout()'><a href='login.html'>�α׾ƿ�</button>");
	        out.println("<script>");      
            out.println("function logout(){");      
            out.println("alert('�α׾ƿ� �Ǿ����ϴ�.')");      
            out.println("history.back();}");     
            out.println("</script>");

		}else {
			out.println("<body>");
			out.println("<script>");
	        out.println("alert('id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.')");      
	        out.println("history.back();");     
	        out.println("</script>");
		}
		out.println("</body></html>");
		
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
