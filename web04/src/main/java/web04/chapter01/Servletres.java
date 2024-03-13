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
	
	
		out.print("�й� : " + number + "<br>");
		out.print("�̸� : " + user +  "<br>");
		
		//����ؿ� 3�� �����°�   ��ũ��Ʈ , addheader->�й��̸�����, send�ٷκ����°�->�����������̷����â
		//response.sendRedirect("nservlet");            1�����    
		//response.addHeader("Refresh", "3;url=nservlet"); 2�����
		//String script = "<script> alert(\"�̵��մϴ�.!!\"); location.href='nservlet'; </script>";
		//out.print(script);  3�����
		RequestDispatcher dis = request.getRequestDispatcher("nservlet");
		dis.forward(request,  response);
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
