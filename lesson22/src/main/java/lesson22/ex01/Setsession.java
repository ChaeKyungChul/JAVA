package lesson22.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sss")
public class Setsession extends HttpServlet {



   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      
      //세션 객체 생성
      HttpSession session = request.getSession();
      
      //유호 시간셋팅
      session.setMaxInactiveInterval(30);
      session.setAttribute("name", "홍길동");
      session.setAttribute("nation", "youldogook");
      out.println("name과 nation을 세션에 생성했습니다.");
      out.println("<br>");
      out.println("<a href='mysession.jsp'>세션보기</a>");
      
   }


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}

