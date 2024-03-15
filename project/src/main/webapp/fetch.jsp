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
<center>
<% List<dto> l=(List<dto>)request.getAttribute("slist"); %>
<table border="5px">
<tr>
<th>Register no</th>
<th>Name</th>
<th>DOB</th>
<th>Father Name</th>
<th>Kannada</th>
<th>English</th>
<th>Hindi</th>
<th>Mathamatics</th>
<th>Science</th>
<th>Social Science</th>
<th>Total Marks</th>
<th>Percentage</th>
<th>Result</th>
<th>CPA</th>
</tr>
<% for(dto a:l){ %>
<tr>
<td><%=a.getRegister_no() %></td>
<td><%=a.getStudent_name() %></td>
<td><%=a.getDate_of_Birth() %></td>
<td><%=a.getFather_name() %></td>
<td><%=a.getKannada() %></td>
<td><%=a.getEnglish() %></td>
<td><%=a.getHindi() %></td>
<td><%=a.getMathamatics() %></td>
<td><%=a.getScience() %></td>
<td><%=a.getSocial_Science() %></td>
<td><%=a.getTotal_marks() %></td>
<td><%=a.getPercentage() %></td>
<td><%=a.getResult() %></td>
<td><%=a.getCPA() %></td>
</tr>
<%} %>
</table>
</center>
</body>
</html>