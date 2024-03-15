<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img alt="" src="https://kseeb.karnataka.gov.in/schoolLogin/Images/KSEAB.jpg">
<form action="update" style="position: relative;top: 50px;font-size: 20px">
<table>
<tr>
	<td><label for="aa">Register_no</label></td>
    <td>:<input type="number" name="regno" value=<%=request.getParameter("regno") %> readonly="readonly"></td>
</tr>
<tr>
	<td><label for="aa">Student_Name</label></td>
    <td>:<input type="text" name="name" value=<%=request.getParameter("name")%>></td>
</tr>
<tr>
	<td><label for="aa">Date_Of_Birth</label></td>
    <td>:<input type="date" name="dob" value=<%=request.getParameter("dob")%>></td>
</tr>
<tr>
	<td><label for="aa">Father_Name</label></td>
    <td>:<input type="text" name="fname" value=<%=request.getParameter("fname")%>></td>
</tr>
<tr>
	<td><label for="aa">Kannada</label></td>
    <td>:<input type="number" name="kan" value=<%=request.getParameter("kan")%>></td>
</tr>
<tr>
	<td><label for="aa">English</label></td>
    <td>:<input type="number" name="eng" value=<%=request.getParameter("eng")%>></td>
</tr>
<tr>
	<td><label for="aa">Hindi</label></td>
    <td>:<input type="number" name="hin" value=<%=request.getParameter("hind")%>></td>
</tr>
<tr>
	<td><label for="aa">Mathamatics</label></td>
    <td>:<input type="number" name="math" value=<%=request.getParameter("math")%>></td>
</tr>
<tr>
	<td><label for="aa">Science</label></td>
    <td>:<input type="number" name="scien" value=<%=request.getParameter("scien")%>></td>
</tr>
<tr>
	<td><label for="aa">Social_Science</label></td>
    <td>:<input type="number" name="ss" value=<%=request.getParameter("ss")%>></td>
</tr>
<tr>
	<td></td>
	<td><button style="font-size: 18px">Update</button></td>
</tr>
</table>
</form>
<pre style="position: relative;top: 100px"><b>Designed, Developed and Hosted by:  Center for e-Governance - Web Portal, Government of Karnataka © 2023, All Rights Reserved.
Best viewed in Chrome v-87.0.4280.141, Microsoft Edge v-87.0.664.75, Firefox -v-83.0 Browsers. Resolution : 1280x800 to 1920x1080</b></pre>
</body>
</html>