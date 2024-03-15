<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*, jspboard.dao.*, jspboard.dto.BDto" %>
     
 <%
	String id = request.getParameter("id"); 
	DBConnect db = new DBConnect(); //db 접속
	Connection conn = db.conn; 
	JBoardDao dao = new JBoardDao(conn);  //viewDB()메소드를 쓰기위해 dao 객체생성
	BDto dto = new BDto(); //viewDB() 리턴 타입인 dto를 받기 위해 dto 객체 생성
	BDto rs = dao.viewDB(id); 

%>
     
     
<%@ include file="inc/header.jsp" %>
<script src="js/summernote-bs4.js"></script>
<script src="js/lang/summernote-ko-KR.min.js"></script>
<script src="js/write.js"></script>
<%@ include file="inc/aside.jsp" %>


         <section>
                <div class="write">
                    <h2 class="text-center mt-4 mb-5 pb-4">글쓰기</h2>
                    <form action="editok.jsp" name="writeform" id="writeform" class="writeform row" method="post">
                        <!-- 게스트일때 적용 -->
                        <div class="col-12 row">
                            <div class="col-6 row form-group">
                                <label class="form-label">이름</label>
                                <input type="text" name="writer" id="writer" class="form-control" placeholder="이름" value="<%=rs.getWriter()%>">
                            </div>
                            <div class="col-6 row form-group">
                                <label class="form-label">비밀번호</label>
                                <input type="password" name="pass" id="password" class="form-control" placeholder="비밀번호" >
                            </div>
                        </div>
                        <div class="col-12 row form-group">
                            <label class="form-label">제목</label>
                            <input type="text" name="title" id="title" class="form-control col-10" placeholder="제목" value="<%=rs.getTitle()%>">
                        </div>
                        <div class="col-12">
                            <textarea name="content" id="contents" class="form-control"><%=rs.getContent() %></textarea>
                        </div>
                    
                        <!-- /게스트일때 적용 -->
                        <div class="col-12 text-center my-5">
                            <a href="index.html" class="btn btn-danger px-5 mx-2">취소</a>
                            <button class="btn btn-primary px-5 mx-2" type="submit">글쓰기</button>
                        </div>
                        
                        <input type="hidden" name="id" value="<%=id %>"/>
                        <!--  
                        <input type="hidden" name="refid" value="" />
                        <input type="hidden" name="depth" value="" />
                        <input type="hidden" name="renum" value="" />
                        -->
                    </form>
                </div>
                
            </section>


<%@ include file="inc/footer.jsp" %> 