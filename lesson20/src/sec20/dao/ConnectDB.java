package sec20.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//oracle.jdbc.OracleDriver <오라클
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결 drivermanger 를 통해 connection 생성하여 db와연결
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javaboard",
					"root",
					"dufrhdgkwk10@" //비번
					);
			System.out.println("데이터베이스 연결 성공");
			
			JBoardDao Jdao = new JBoardDao(conn);
			//int rs = Jdao.insertDB("반갑습니다.1", "반갑습니다의 내용입니다.1", "김주성1"); //<<--삽입
			//int rs = Jdao.updateDB("봄이 왔습니다", "밥만 먹으면 졸려요.", "어구",9);  //<<-- 9번 업데이트
			//int rs = Jdao.deleteDB(5);  //<5번 id 삭제
			Jdao.select();   // 검색
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
				System.out.println("데이터베이셔 연결끊김");
			}catch(SQLException e){}
		}
		
	}

}
