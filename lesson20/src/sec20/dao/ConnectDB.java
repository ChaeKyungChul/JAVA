package sec20.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//oracle.jdbc.OracleDriver <����Ŭ
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//���� drivermanger �� ���� connection �����Ͽ� db�Ϳ���
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaboard",
					"root",
					"dufrhdgkwk10@" //���
					);
			System.out.println("�����ͺ��̽� ���� ����");
			
			JBoardDao Jdao = new JBoardDao(conn);
			//int rs = Jdao.insertDB("�ݰ����ϴ�.1", "�ݰ����ϴ��� �����Դϴ�.1", "���ּ�1"); //<<--����
			//int rs = Jdao.updateDB("���� �Խ��ϴ�", "�丸 ������ ������.", "�",9);  //<<-- 9�� ������Ʈ
			//int rs = Jdao.deleteDB(5);  //<5�� id ����
			Jdao.select();   // �˻�
			//System.out.println(rs);
			
					
			//DriverManager.getConnection(
				//	url,
				//	user,
				//	password
				//	); 
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null)conn.close();
				System.out.println("�����ͺ��̼� �������");
			}catch(SQLException e){}
		}
		
	}

}
