package jspboard.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnect {
   public Connection conn = null;	
   private InitialContext initContext;
  
   //而ㅻ꽖�뀡 �븯�뒗 硫붿냼�뱶
   public Connection getConnection() throws SQLException, NamingException{
	  if(conn == null || conn.isClosed()) {
  	    initContext = new InitialContext(); //JNDI 而⑦뀓�뒪�듃 珥덇린�솕
		DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/javaboard");
		//JNDI�뿉�꽌 �씠由꾩쓣 李얠븘�샂. "java:/comp/env/" �씠由꾩갼�뒗 �뜲 �궗�슜�릺�뒗 �젒�몢�뼱
		conn = ds.getConnection();
		System.out.println("db�젒�냽 �꽦怨�");
	  }
	  return conn;
  }
   
  //而ㅻ꽖�뀡 �떕�뒗 硫붿냼�뱶 
  public void closeConnection() {
	  try {
		  if(conn != null && !conn.isClosed()) {
			  conn.close();
			  System.out.println("db瑜� �떕�븯�뒿�땲�떎.");
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }finally {
		  conn = null;
	  }
  }
   
}
