package cron.com;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/cron")
public class cron extends HttpServlet {

 
	  //필드
	 private long num;
	 private Timer timer;
	 private TimerTask task;
	 
	 //메소드
	 public void init() {
		 int delay = 0;
		 int period = 5000;
		 timer = new Timer();
		 task = new TimerTask() {
		     public void run() {
		    	 num++;
		     }
		 };
		 timer.scheduleAtFixedRate(task, delay, period);  //5\초에 한번씩
	 }
	 
	 public void destroy() {
		 task.cancel();
		 timer.cancel();
		 
	 }
	 
	 
	 
	 
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException{
		 System.out.println("doGet 실행");
		 PrintWriter out = response.getWriter();
		 
		 // 브라우저에게 html이 utf-8혀익이라고 전달
		 response.setContentType("text/html;charset=UTF-8");
		 
		 // 서블릿에서 만드는 html 파일의 인코딩이 utf-8이다
		 response.setCharacterEncoding("utf-8");
		 
		   out.println("<html>");
	        out.println("<head><title>크론텍스트</title></head>");
	        out.println("<body>");
	        out.println("<h1>크론테스트</h1>");
	        out.println("<p>5초에 한번씩 숫자가 증가한다.</p>");
	        out.println("<p>초기화 하고 싶다면 새로기침이 어떨까한다.</p>");
	        out.println("<p> 숫자 = " + num);
	        out.println("</p></body>");
	        out.println("</html>");
	 } 
}
