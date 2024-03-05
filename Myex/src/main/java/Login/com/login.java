package Login.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // REQUEST 로 받은 값을 UTF8로 인코딩
		boolean flag = false;

		String userid = req.getParameter("username");         //GETPARAMETER 를 이용해서 REQUSET 받음
		String userpass = req.getParameter("email");
		System.out.println(userid + ", " + userpass);
		if(userid.equals("admin") && userpass.equals("123456")) {
			flag = true;
		}
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>로그인</title>");
		out.println("</head>");
		if(flag) {
			out.println("<body><h1>" + userid + "님 , 로그인 되었습니다. </h1>");
		}else {
			out.println("<body><h1>너, 누구냐? </h1>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}