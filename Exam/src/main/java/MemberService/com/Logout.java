package MemberService.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 세션을 가져옵니다. 세션이 없다면 새로 생성하지 않습니다.
        HttpSession session = request.getSession(false);
        
        // 세션이 존재한다면 세션을 무효화합니다.
        if (session != null) {
            session.invalidate();
        }
        
        // 로그아웃 되었다는 메시지를 사용자에게 보여줍니다.
        response.setContentType("text/html; charset=UTF-8"); // 응답의 컨텐츠 타입과 문자 인코딩을 설정
        response.getWriter().print("로그아웃 되었습니다."); // 사용자에게 메시지 출력
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // doPost에서 doGet을 호출하여, GET과 POST 요청 모두 처리
        doGet(request, response);
    }
}
