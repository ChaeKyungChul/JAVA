package MemberService.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {


	protected void doGet(HttpRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8"); // REQUEST �� ���� ���� UTF8�� ���ڵ�
		boolean flag = false;

		String userid = req.getParameter("username");         //GETPARAMETER �� �̿��ؼ� REQUSET ����
		String userpass = req.getParameter("password");
		System.out.println(userid + ", " + userpass);
		if(userid.equals("ezen") && userpass.equals("12345")) {
			flag = true;
		}
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><meta charset='utf-8'><title>�α���</title>");
		out.println("</head>");
		if(flag) {
			out.println("<body><h1>" + userid + " alert  , �α��� �Ǿ����ϴ�~~~. </h1>");
		}else {
			out.println("<body><h1> id�Ǵ� password�� �ùٸ����ʽ��ϴ�. </h1>");
		}
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}