package lesson22.ex01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleFilter implements Filter {

   @Override
   public void init(FilterConfig filterConfig) throws ServletException {
      System.out.println("필터가 초기화 되었음");
   }
   
   @Override
   public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
         throws IOException, ServletException {
      
      System.out.println("요청 전에 필터가 처리됨");
      chain.doFilter(req, res);
      System.out.println("응답 전에 필터가 처리됨.");

   }

   @Override
   public void destroy() {
      System.out.println("필터가 제거되었음");
   }
   
}
