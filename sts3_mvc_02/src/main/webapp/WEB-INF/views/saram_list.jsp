<%@page import="org.comstudy21.myapp.saram.SaramDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 사람 정보 리스트</h1>
<hr />
<table border="1" width = 500>
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>이메일</th>
	</tr>
	
	<%
	ArrayList<SaramDto> saramList = (ArrayList)request.getAttribute("saramList");
	for(int i =0; i<saramList.size(); i++){
		SaramDto saram = saramList.get(i);
	%>
	<tr>
		<td><%= i%></td>
		<td><%= saram.getId() %></td>
		<td><%= saram.getName() %></td>
		<td><%= saram.getEmail() %></td>
	</tr>
	<%
	}
	%>
</table>
<a href ="<%= request.getContextPath() %>">home으로</a>
<br />
<a href ="<%= request.getContextPath() %>/input.saram">사람정보입력</a>

</body>
</html>