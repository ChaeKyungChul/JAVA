package lesson23.sec01;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class loginServlet extends HttpServlet {

	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // TODO Auto-generated method stub
	      response.getWriter().append("Served at: ").append(request.getContextPath());
	   }


	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		   response.setContentType("text/html;charaset=utf-8");
		   
	      String username = request.getParameter("username");
	      String userpass = request.getParameter("userpass");
	      String chara = request.getParameter("chara");
	      
	      if(isValidateUser(username, userpass)) {
	         HttpSession session = request.getSession();
	         session.setAttribute("user", username);
	         response.sendRedirect("login.jsp?char="+chara); //성공하면 가는 곳
	      }else {
	         response.sendRedirect("login.html"); //실패하면 가는 곳
	      }
	   
	   }
	   
	   public boolean isValidateUser(String uname, String upass) {
	      //사용자 인증 로직
	      ServletContext context = this.getServletContext();
	      String loginuser = context.getInitParameter("user");
	      String loginpass = context.getInitParameter("pass");
	      if(uname.equals(loginuser) && upass.equals(loginpass)) {
	         return true;
	      }else {
	          return false;
	      }    
	   }
	   
	}


