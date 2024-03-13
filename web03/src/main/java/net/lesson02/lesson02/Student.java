package net.lesson02.lesson02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		//파라미터 타입은 모두 문자열로 들어오므로 추출을 위해서는 각자 타입엠 ㅏㅈ도록 타입을 변환해야한다
		int num = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		double score = Double.parseDouble(request.getParameter("scored")) - 1.0f;
		
		
		out.println(num);
		out.println(name);
		out.println(score);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
