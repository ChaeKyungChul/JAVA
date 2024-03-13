package net.lesson02.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/check" }, 
		initParams = { 
				@WebInitParam(name = "adid", value = "admin"), 
				@WebInitParam(name = "adpass", value = "123456")
		})
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); //응답을 text/html 타입의utf-8 인코딩 
		PrintWriter out = response.getWriter();  //printWriter 클래스를 out으로 객체화해서 웹을 사용
		request.setCharacterEncoding("utf-8"); // 요청을 utf-8 타입으로받겟다.
		String username = request.getParameter("userid");
		String userpass = request.getParameter("userpass");
		
		String adminId = getInitParameter("adid");
		String adminPass = getInitParameter("adpass");
		
		Boolean ok = false;
		
		if(username.equals(adminId) && userpass.equals(adminPass)) {
			ok = true;
		}
		String htmlHead = "<html>\n<meta charset='utf-8>\n<head><title>로그인</title></head>\n'";
		htmlHead += "<body><h1>로그인 결과</h1>\n";
		if(ok) {
			htmlHead += "<p>환영합니다." + username + "님</p>\n";
			htmlHead += "<p>로그인 되엇습니다.</p>";
		}else {
			htmlHead += "<p style='color:red'> 너누구냐 </p>\n";
		}
		htmlHead += "</body></html>";
				
		out.println(htmlHead);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
