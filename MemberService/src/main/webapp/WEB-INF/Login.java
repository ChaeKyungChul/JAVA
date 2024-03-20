package MemberService.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse res, boolean flag) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); 

		String userid = req.getParameter("username");        
		String password = req.getParameter("password");
		System.out.println(userid + ", " + password);
		if(userid.equals("ezen") && password.equals("12345")) {
			flag = true;
		}
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
		out.println("</head>");
		if(flag) {
			out.println("<body><h1>" + userid + " 로그인되었습니다. </h1>");
		}else {
			out.println("<body><h1> id또는 password가 올바르지않습니다. </h1>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}