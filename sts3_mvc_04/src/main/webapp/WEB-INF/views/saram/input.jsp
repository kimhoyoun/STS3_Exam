<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정보 추가 페이지</h1>
<hr />

<form action="input.action" method = "POST">
	<table border = "1" width ="500">
		<tr>
			<th>ID</th>
			<td><input type="text" name = "id" /></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name = "name" /></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name = "email" /></td>
		</tr>
		<tr>
			<th colspan = "2"><input type="submit" /></th>
		</tr>
	</table>
</form>
<hr />
<a href="<%=request.getContextPath()%>/saram/list.action">리스트</a>
</body>
</html>