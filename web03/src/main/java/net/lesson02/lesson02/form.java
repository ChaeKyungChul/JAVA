package net.lesson02.lesson02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		req.setCharacterEncoding("utf-8");
		Enumeration e = req.getParameterNames();
		
		out.println("<html>");
		out.println("<head><title>회원정보</title></head>");
		out.println("<body>");
		
		while(e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String[] values = req.getParameterValues(name);
			if(values != null) {
				for(int i = 0; i < values.length; i++) {
					out.print("<div><label>" + name + " : </label>" + values[i] + "</div>");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}