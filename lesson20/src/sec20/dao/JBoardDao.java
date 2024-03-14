package sec20.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JBoardDao {
   //db�� ����
   public int insertDB(Connection conn, String title, String content, String writer) {
      int id = 0;
      PreparedStatement pstmt = null;
//      String sql = "insert into jboard (refid, renum, title, content, writer) "
//             + "values (6, 6, '�ȳ��ϼ���?', '������ ���⿡ ���ϴ�.', 'ȫ�浿')";
      String sql = "insert into jboard (title, content, writer) "
             + "values (?, ?, ?)";
      try {
         pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         pstmt.setString(1, title);
         pstmt.setString(2, content);
         pstmt.setString(3, writer);
         pstmt.executeUpdate();
         
         //sql�� pk�� ������ ���� �ڵ����� ������
         ResultSet res = pstmt.getGeneratedKeys(); // ������ ������ �� ������ Ű���� ��ȯ
         if(res.next()) {
            id =  res.getInt(1);
         }
         sql = "update jboard set refid=? where id=?" ;
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, id);
         pstmt.setInt(2, id);
         pstmt.executeUpdate();
         
         //Statement stmt = conn.createStatement();
         // rs = stmt.executeUpdate(sql);
         System.out.println(id);
      } catch (SQLException e) {
         e.printStackTrace();
      }
         return id;
   }
}


	   
	   
	
