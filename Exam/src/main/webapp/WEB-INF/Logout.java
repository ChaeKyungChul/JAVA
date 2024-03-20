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
        // ������ �����ɴϴ�. ������ ���ٸ� ���� �������� �ʽ��ϴ�.
        HttpSession session = request.getSession(false);
        
        // ������ �����Ѵٸ� ������ ��ȿȭ�մϴ�.
        if (session != null) {
            session.invalidate();
        }
        
        // �α׾ƿ� �Ǿ��ٴ� �޽����� ����ڿ��� �����ݴϴ�.
        response.setContentType("text/html; charset=UTF-8"); // ������ ������ Ÿ�԰� ���� ���ڵ��� ����
        response.getWriter().print("�α׾ƿ� �Ǿ����ϴ�."); // ����ڿ��� �޽��� ���
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // doPost���� doGet�� ȣ���Ͽ�, GET�� POST ��û ��� ó��
        doGet(request, response);
    }
}
