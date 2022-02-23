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
<h1>사람 정보 수정</h1>
<%
SaramDto saram = (SaramDto)request.getAttribute("saramDto");
if(saram == null){
	out.println("<h3>수정할 사람 정보가 없다 </h3>");
}else{
	
%>
<form action="modify.action" method = "POST">
	<input type = "hidden" name = "idx" value= "<%= saram.getIdx() %>" />
	<table border="1" width="550">
		<tr>
			<th>ID</th>
			<td><input type="text" name = "id" value = "<%=saram.getId() %>" /></td>
		</tr>
		<tr>
			<th>성명</th>
			<td><input type="text" name = "name" value ="<%=saram.getName() %>"/></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name = "email" value = "<%=saram.getEmail() %>"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value = "저장" /></td>
		</tr>
	</table>
</form>
<%
}
%>
<hr />
<a href="<%=request.getContextPath()%>/saram/list.action">리스트로 돌아가기</a>
</body>
</html>