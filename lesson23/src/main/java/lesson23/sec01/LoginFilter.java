package lesson23.sec01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override		
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
	throws IOException, ServletException{ 
	HttpServletRequest request = (HttpServletRequest) req;
	HttpServletResponse response = (HttpServletResponse) res;
	HttpSession session = request.getSession(false);
	
	if(session == null || session.getAttribute("user") == null) {
		response.sendRedirect("login.html"); // 세션 없으면 로그인폼으로 이동
	}else {
		chain.doFilter(request, response);// 세션 있으면 다음 리소스 진행
	}
		

 }
}
