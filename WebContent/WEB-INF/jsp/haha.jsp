<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.entiey.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>今天就到这儿啦，明天见！</h1>
  <%
  String id=session.getAttribute("id").toString();
  out.println(id);
  Student s=(Student)session.getAttribute("student");
  out.println(s);
  %>
  <br>
  ${requestScope.name }<br>
  ${requestScope.age }<br>
  ${sessionScope.id}<br>
  ${sessionScope.student}<br>
</body>
</html>