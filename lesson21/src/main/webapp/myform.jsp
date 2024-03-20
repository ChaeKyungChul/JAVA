<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   body{
   background:#ededed;
   
   
   }
   
   
 
 form{
 background:#fff;
  width:600px;
  margin-left:auto;
  margin-right:auto;
  padding:40px;
  border:1px solid #ddd;
  margin-top:40px;
 }
 form ul{
  list-style-type:none;
  margin:0;
  padding:0;
  }
  
  label{
  display:inline-block;
  padding-right:15px;
  width:100px;
  text-align:center;
  
  }
  
  li{
  
  line-height:40px;
  border-bottom:1px dashe #ededed;
  }
   input[type=text-center],
   input[type=text]{
   width:300px;
   padding:8px;
   border:1px solid #ddd;
   border-radius:5px;
   background:#ededed;
   }
	.text-center{
	 text-align:center;
	}
	.btn{
	padding : 8px 15px;
	
	}
	
</style>

</head>
<body>
<h1 class="text-center">EL 태그 연습</h1>
  <form action="myformok2.jsp " name="myform" method="post">
  <ul>
  	<li><label>아이디</label>
  	 	<input type="text" name="userid"/>
  	 	</li>
  	<li><label>비밀번호</label>
  	 	<input type="text" name="userpass"/>
  	 	</li> 	 	
 	<li><label>이메일</label>
  	 	<input type="text" name="useremail"/>
  	 	</li>  	
 	<li><label>주소</label>
  	 	<input type="text" name="address"/>
  	 	</li>  
 	<li><label>성별</label>
  	 	<label><input type="radio" name="sex" value="여자" checked> 여자</label>
  	 	<label><input type="radio" name="sex" value="남자" > 남자</label>
  	 	</li>  	 
  	 <li class="text-center">
  	 	<button type="submit" class="btn">전송</button>
  	 	</li>
 		
  </ul>
  
  
  
  
  
  </form>
  
</body>
</html>

<!-- 
아이디 : <input type="text" name="username"> <br><br>
   비밀번호 : <input  type="text" name="password"> <br><br>
   이메일 : <input type="email" name="email"> <br><br>
   주소  : <input type="addrs" name = "addrs"> <br><br>
  <p>성별</p> 
    <input type="checkbox"  name="gender" value="남">남 
   	<input type="checkbox"  name="gender" value="여">여
   	 <br><br>
   	 <input type="submit" value="보내기"/> -->