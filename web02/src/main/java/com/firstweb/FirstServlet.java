package com.firstweb;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    //서블릿 시작 void라 바로출력
   public void init(ServletConfig config) throws ServletException {
      System.out.println("init 메소드 실행");
   }


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   //doGet, doPost 둘중 한곳에만 적어도 가능
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }
   
   //서블릿 종료
   public void destroy() {
      System.out.println("destroy 메소드 실행");
   }

}
