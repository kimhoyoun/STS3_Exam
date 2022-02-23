<%@page import="org.comstudy21.myapp.saram.SaramDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
SaramDto saram = (SaramDto)request.getAttribute("saramDto");
%>
<h1>정보 수정 페이지</h1>
<hr />

<form action="modify.action" method = "POST">
	<input type="hidden" name = "idx" value = "<%=saram.getIdx() %>" />
	<table border = "1" width ="500">
		<tr>
			<th>ID</th>
			<td><input type="text" name = "id" value = "<%=saram.getId() %>"/></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name = "name" value = "<%=saram.getName() %>"/></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name = "email" value = "<%=saram.getEmail() %>"/></td>
		</tr>
		<tr>
			<th colspan = "2"><input type="submit"/></th>
		</tr>
	</table>
</form>
<hr />
<a href="detail.action?idx=<%=saram.getIdx()%>">이전</a>
</body>
</html>