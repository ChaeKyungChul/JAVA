package sec20.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
      

      public static void main(String[] args) {
         Connection conn = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //����̹� �Ŵ����� ���ؼ� Ŀ�ؼ��� �����Ͽ� db�� ����
            //���� 
         conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/javaboard",
                  "root",
                  "dufrhdgkwk10@"   //��й�ȣ
                  
                  );
               System.out.println("database ���� ����");
               
               JBoardDao Jdao = new JBoardDao();
               int rs = Jdao.insertDB(conn,"�ݰ����ϴ�.2", "�ݰ����ϴ��� �����Դϴ�.2","���ΰ�");
               System.out.println(rs);
               
         } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
         } catch(SQLException e) {
            e.printStackTrace();
         } finally {
               try  {
                  conn.close();
                  System.out.println("database ������ ������");
               }catch(SQLException e) {
                  e.printStackTrace();
            }
         }
         //oracle.jdbc.OracleDriver
      }
}
