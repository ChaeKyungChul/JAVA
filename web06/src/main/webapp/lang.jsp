<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>forward 테스트</h2>
   <div>
     <form name="form" method="post" action="langok.jsp">
        <div>
           <label>국가</label>
           <select name="nation">
              <option value="korea" selected>한국어</option>
              <option value="enlish">영어</option>
        
        </div>
        <div>
          <label>이름</label>
          <input tpye="text" name="name" />
        </div>   
     	<div>
     	   <label>주소</label>
     	   <input type="text" name="addr"/>
     	</div>
     	<div>
     	    <br><or>
     	    <input type="submit" value=" 전 송 "/>
     	</div>
     
     </form>
   
   </div>
</body>
</html>