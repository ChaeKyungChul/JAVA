package jspBoard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import jspBoard.dto.BDto;

public class JBoardDao {
 
   PreparedStatement pstmt = null;
   ResultSet res = null;
   Connection conn;
   
    public JBoardDao(Connection conn) {
       this.conn = conn;
    }
    
    //select
    public ArrayList<BDto> selectDB(){
       
       ArrayList<BDto> dtos = new ArrayList<>();
   
       String sql = "select * from jboard order by refid desc, renum asc"
             + " limit ?, ?";
       try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, 0);
         pstmt.setInt(2, 20);
         res = pstmt.executeQuery();
       
         while(res.next()) {
           int id = res.getInt("id");
           int refid = res.getInt("refid");
           int depth = res.getInt("depth");
           int renum = res.getInt("renum");
           String title = res.getString("title");
           String content = res.getString("content");
           String writer = res.getString("writer");
           String pass = res.getString("pass");
           String userid = res.getString("userid");
           int hit = res.getInt("hit");
           int chit = res.getInt("chit");
           Timestamp wdate = res.getTimestamp("wdate");
           
           BDto bDto = new BDto();
           bDto.setId(id);
           bDto.setRefid(refid);
           bDto.setDepth(depth);
           bDto.setRenum(renum);
           bDto.setTitle(title);
           bDto.setContent(content);
           bDto.setWriter(writer);
           bDto.setPass(pass);
           bDto.setUserid(userid);
           bDto.setHit(hit);
           bDto.setChit(chit);
           bDto.setWdate(wdate);
           dtos.add(bDto);
         }
       } catch(SQLException e) {
          e.printStackTrace();
       } finally {
          try {
             if(res != null) res.close();
             if(pstmt != null) pstmt.close();
             if(conn != null) conn.close();
          }catch(SQLException e) {e.printStackTrace();}   
       }
       
       return dtos;
    }
   
    public BDto viewDB(String nums) {
       int num = Integer.parseInt(nums);
       String sql = "select * from jboard where id=?";
      BDto bDto = new BDto();
       try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, num);
         res = pstmt.executeQuery();
         while(res.next()) {          
             int id = res.getInt("id");
             int refid = res.getInt("refid");
             int depth = res.getInt("depth");
             int renum = res.getInt("renum");
             String title = res.getString("title");
             String content = res.getString("content");
             String writer = res.getString("writer");
             String pass = res.getString("pass");
             String userid = res.getString("userid");
             int hit = res.getInt("hit");
             int chit = res.getInt("chit");
             Timestamp wdate = res.getTimestamp("wdate");
             
             bDto.setId(id);
             bDto.setRefid(refid);
             bDto.setDepth(depth);
             bDto.setRenum(renum);
             bDto.setTitle(title);
             bDto.setContent(content);
             bDto.setWriter(writer);
             bDto.setPass(pass);
             bDto.setUserid(userid);
             bDto.setHit(hit);
             bDto.setChit(chit);
             bDto.setWdate(wdate);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
          try {
              if(res != null) res.close();
              if(pstmt != null) pstmt.close();
              if(conn != null) conn.close();
           }catch(SQLException e) {e.printStackTrace();}   
        }
       return bDto;
    }
    
    //쓰기
    public int insertDB(BDto dto) {
       int num = 0;
       String sql = "insert into jboard (title, content, writer, pass, userid) values ( ?, ?, ?, ?, ?)";
       try {
          pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          pstmt.setString(1, dto.getTitle());
          pstmt.setString(2, dto.getContent());
          pstmt.setString(3, dto.getWriter());
            pstmt.setString(4, dto.getPass());
            if(dto.getUserid()!=null) {
               pstmt.setString(5, dto.getUserid());
            }else {
               pstmt.setString(5, "GUEST");
            }
            pstmt.executeUpdate();
            res = pstmt.getGeneratedKeys(); //입력 후 auto increment 값을 반환 받음
            if(res.next()) {
               num = res.getInt(1);
               updateDB(num, num, "refid");  //refid 업데이트
            }
            
       }catch(SQLException e) {
          e.printStackTrace();
       }finally {
          try {
               if(res != null) res.close();
               if(pstmt != null) pstmt.close();
               if(conn != null) conn.close();
            }catch(SQLException e) {e.printStackTrace();}   
         }
       return num;
    }
    
    //업데이트
    public int updateDB(int id, int num, String column) {
        int rs = 0;
        String sql = "update jboard set "+ column +"=? where id=?";
        
        try {
         pstmt = conn.prepareStatement(sql); 
         pstmt.setInt(1, num);
            pstmt.setInt(2, id);
            rs = pstmt.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
          try {
               if(pstmt != null) pstmt.close();
               if(conn != null) conn.close();
            }catch(SQLException e) {e.printStackTrace();}   
         }
    
       return rs;
    }
    
}




