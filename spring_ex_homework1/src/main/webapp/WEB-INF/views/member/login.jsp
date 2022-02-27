<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 페이지</h2>

<form action="login.action" method = "POST">
	<table border="1" width="400">
		<tr>
			<th>아이디</th>
			<td><input type = "text" name = "id"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type = "password" name = "pw"></td>
		</tr>
		<tr>
			<th colspan = 2><input type = "submit" value = "로그인"></th>
		</tr>
	</table>
</form>
</body>
</html>