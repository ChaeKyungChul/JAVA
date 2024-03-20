<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   body{
   background:#ededed;  
   }
   
 .box{
 background:#fff;
  width:600px;
  margin-left:auto;
  margin-right:auto;
  padding:40px;
  border:1px solid #ddd;
  margin-top:40px;
 }
 .box ul{
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
  
.text-center{
	 text-align:center;
	}
</style>
</head>
<body>
	<h1 class="text-center"> 헤더 정보 받아오기 </h1>
	<div class="box">
	 <ul>
	 	<li><label>웹브라우저 정보 </label> ${header["user-agent"]} </li>
	 	<li><label>사용자 컴퓨터</label>${header["host"]} </li>
	 </ul>
	</div>
	<h1 class="text-center"> request. 정보 받아오기</h1>
	<div class="box">
	 <ul>
	 	<li><label>http 메소드 </label>${pageContext.request.method}  </li>
	 </ul>
	</div>
	
		<h1 class="text-center"> 파라미터 정보 받아오기</h1>
	<div class="box">
	 <ul>
	 	<li><label>name 파라미터 </label>${param["name"]}  </li>
	 	<li><label>name 파라미터 </label>${empty param["name"]}  </li>
	 </ul>
	</div>
	
	
		<h1 class="text-center"> Cookie 정보 받아오기</h1>
	<div class="box">
	 <ul>
	 	<li><label>세션 id </label>${cookie["JSESSIONID"].value}  </li>
	
	 </ul>
	</div>
	


</body>
</html>