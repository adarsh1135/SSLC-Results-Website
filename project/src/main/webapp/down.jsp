<%@page import="student.dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% dto l=(dto)request.getAttribute("sslist"); %>
<button style="font-size: 35px"><a href="update.jsp?
regno=<%=l.getRegister_no()%>
&name=<%=l.getStudent_name()%>
&dob=<%=l.getDate_of_Birth()%>
&fname=<%=l.getFather_name()%>
&kan=<%=l.getKannada()%>
&eng=<%=l.getEnglish()%>
&hind=<%=l.getHindi()%>
&math=<%=l.getMathamatics()%>
&scien=<%=l.getScience()%>
&ss=<%=l.getSocial_Science()%>
">UPDATE_THE_DATA</a></button>
</body>
</html>