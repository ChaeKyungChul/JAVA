package sec20.dao;


PreparedStatement pstmt = null;
Statement stmt = null;
ResultSet res = null;
Connection conn;

public JBoardDao(Connection conn) {
   this.conn = conn;
}


//db에 쓰기
public int insertDB(String title, String content, String writer) {
 int id = 0;
 String sql = "insert into jboard ( title, content, writer) "
       + " values (?, ?, ?)";   
 try {
   pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
   pstmt.setString(1, title);
   pstmt.setString(2, content);
   pstmt.setString(3, writer);
   pstmt.executeUpdate();
   
   res = pstmt.getGeneratedKeys(); //쿼리가 실행된 후 생성된 키값이 반환됨
   if(res.next()) {
      id = res.getInt(1);
   }
   sql = "update jboard set refid=? where id=?";
   pstmt = conn.prepareStatement(sql);
   pstmt.setInt(1, id);
   pstmt.setInt(2, id);
   pstmt.executeUpdate();
   
  System.out.println(id);
} catch (SQLException e) {
  e.printStackTrace();
} finally {
  try {
     if(pstmt != null) pstmt.close();
  } catch (SQLException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
  }
}
 return id;
}

//db 수정
public int updateDB(String title, String content, String writer, int id) {
  int rs = 0;
  String sql = "update jboard set title=?, content=?, writer=? where id=?";
   try {
     pstmt = conn.prepareStatement(sql);
     pstmt.setString(1, title);
     pstmt.setString(2, content);
     pstmt.setString(3, writer);
     pstmt.setInt(4, id);
     //System.out.println(pstmt);
     rs = pstmt.executeUpdate();
  } catch (SQLException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
  } finally {
     try {
        if(pstmt != null) pstmt.close();
     } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
     }
  }      
  return rs;
}

//db 삭제
public int deleteDB(int id) {
  int rs = 0;
  String sql = "delete from jboard where id=?";
   try {
     pstmt = conn.prepareStatement(sql);
     pstmt.setInt(1, id);
     rs = pstmt.executeUpdate();
   } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
  }finally {
     try {
        if(pstmt != null) pstmt.close();
     } catch (SQLException e) {
     // TODO Auto-generated catch block
          e.printStackTrace();
     }
  }      
  return rs;
}

//db 검색
public void select() {
  String sql = "select * from jboard order by refid desc, renum asc";
  try {
     stmt = conn.createStatement();
     res = stmt.executeQuery(sql);
     while(res.next()) {
        System.out.println(res.getInt("id") + ", " + res.getString("title"));
     }
     
  } catch (SQLException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
  }
        
}
}


	   
	   
	
