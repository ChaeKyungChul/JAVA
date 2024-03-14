package sec20.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
      

      public static void main(String[] args) {
         Connection conn = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //드라이버 매니저를 통해서 커넥션을 생성하여 db와 연결
            //연결 
         conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/javaboard",
                  "root",
                  "dufrhdgkwk10@"   //비밀번호
                  
                  );
               System.out.println("database 연결 성공");
               
               JBoardDao Jdao = new JBoardDao();
               int rs = Jdao.insertDB(conn,"반갑습니다.2", "반갑습니다의 내용입니다.2","주인공");
               System.out.println(rs);
               
         } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
         } catch(SQLException e) {
            e.printStackTrace();
         } finally {
               try  {
                  conn.close();
                  System.out.println("database 연결이 끊어짐");
               }catch(SQLException e) {
                  e.printStackTrace();
            }
         }
         //oracle.jdbc.OracleDriver
      }
}
