 <%@page import="student.dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="result.css">
</head>
<body>
<%dto dto=(dto)request.getAttribute("result"); %>
<center>
<div class="mm">
<h1>Karnataka School Examination and Assessment Board</h1>
<h3>SSLC Main Examination Results - 2023</h3>
</div>

<div class="gh">
<div class="gg">
<pre id="ll"><i>Name                           <%=dto.getStudent_name() %>                  </i></pre>
</div>
<div class="hh">
<pre id="kk"><i>Reg.no                         <%=dto.getRegister_no() %>                   </i></pre>
</div>
</div>

<div class="pp">Markscard</div>
<table class="tt">
<tr>
<th>Subject</th>
<th>Marks</th>
<th>Grade</th>
</tr>
<tr>
<td>Kannada</td>
<td><%=dto.getKannada() %></td>
<td><%=dto.getkGrade() %></td>
</tr>
<tr>
<td>English</td>
<td><%=dto.getEnglish() %></td>
<td><%=dto.geteGrade() %></td>
</tr>
<tr>
<td>Hindi</td>
<td><%=dto.getHindi() %></td>
<td><%=dto.gethGrade() %></td>
</tr>
<tr>
<td>Mathamatics</td>
<td><%=dto.getMathamatics() %></td>
<td><%=dto.getmGrade() %></td>
</tr>
<tr>
<td>Science</td>
<td><%=dto.getScience() %></td>
<td><%=dto.getsGrade() %></td>
</tr>
<tr>
<td>Social Science</td>
<td><%=dto.getSocial_Science() %></td>
<td><%=dto.getSsGrade() %></td>
</tr>
<tr>
<th>Total Marks</th>
<th colspan="2"><%=dto.getTotal_marks() %></th>
</tr>
</table>

<table class="dd">
<tr>
<td style="background-color: #00ff40;">Result</td>
<th style="background-color: #00ff40;"><%=dto.getResult() %></th>
</tr>
<tr>
<td style="background-color: #00ff40;">CGA</td>
<th style="background-color: #00ff40;"><%=dto.getCPA()%></th>
</tr>
</table>
</center>
<pre class="cc">Disclaimer: Neither NIC  nor KSEAB, Karnataka is responsible for any inadvertent error that may have crept in the results being published on NET. The results published on net are for immediate information to the
examinees. These cannot be treated as original mark sheets.

Best viewed in IE 9.0 and above and Chrome and Mozilla Firefox                    Content owned, maintained & updated by KSEAB               Designed, Developed & Hosted by National Informatics Centre, Karnataka</pre>
</body>
</html>