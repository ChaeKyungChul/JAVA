package sec20.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JBoardDao {
   //db에 쓰기
   public int insertDB(Connection conn, String title, String content, String writer) {
      int id = 0;
      PreparedStatement pstmt = null;
//      String sql = "insert into jboard (refid, renum, title, content, writer) "
//             + "values (6, 6, '안녕하세요?', '내용은 여기에 씁니다.', '홍길동')";
      String sql = "insert into jboard (title, content, writer) "
             + "values (?, ?, ?)";
      try {
         pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         pstmt.setString(1, title);
         pstmt.setString(2, content);
         pstmt.setString(3, writer);
         pstmt.executeUpdate();
         
         //sql에 pk로 지정된 값을 자동으로 가져옴
         ResultSet res = pstmt.getGeneratedKeys(); // 쿼리가 실행한 후 성생된 키값이 반환
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


	   
	   
	
