<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="lesson24.TestClass"  %>  
 <%
 
	String name = request.getParameter("name");
 	String content = request.getParameter("content");
 	TestClass ts = (TestClass) request.getAttribute("ts");
 	ts.setMyname();

 %>
<p>view</p>
<h1><%=name %></h1>
<p><%=content %></p>
<p><%=ts.getMyname() %> </p>