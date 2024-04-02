package jspBoard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jspBoard.dto.ImgDto;

public class JBoardImgDao {
	
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet res = null;
	Connection conn;
	
    public JBoardImgDao(Connection conn) {
    	this.conn = conn;
    }
    
    //저장
    public String insertDB(ImgDto dto) {
    	String result = "";
    	int rs = 0;
    	String sql = "insert into jboard_img (ofilename, nfilename, ext, filesize, userid, imnum) "
    			+ "values (?,?,?,?,?,?)";	
    	try {  		
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setString(1, dto.getOfilename());
    		pstmt.setString(2, dto.getNfilename());
    		pstmt.setString(3, dto.getExt());
    		pstmt.setLong(4, dto.getFilesize());
    		pstmt.setString(5, dto.getUserid());
    		pstmt.setString(6, dto.getImnum());
    		System.out.println(pstmt);
    		rs = pstmt.executeUpdate(); 	
    		
    		if(rs != 0) {
    			result = dto.getImnum();
    		}
    	}catch(SQLException e) {
    		System.out.println("에러");
    		e.printStackTrace();
    	}finally {
    		try {
    			if(pstmt != null) pstmt.close();
    		}catch(SQLException e) {}
    	}
    	
    	return result;
    }
    
    //업데이트 
    public int updateDB(int imnum, int jboard_id) {
    	int result = 0;
    	String sql = "update jboard_img set jboard_id = ? where imnum = ?";
    	try {
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setInt(1, jboard_id);
    		pstmt.setInt(2, imnum);
    		result = pstmt.executeUpdate();
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}finally {
    		try {
    			if(pstmt != null) pstmt.close();
    		}catch(SQLException e) {}
    	}
    	return result;
    }
}


