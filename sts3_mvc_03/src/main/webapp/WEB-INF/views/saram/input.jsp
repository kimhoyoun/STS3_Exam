<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사람 정보 등록</h1>
<form action="input.action" method = "POST">
	<table border="1" width="550">
		<tr>
			<th>ID</th>
			<td><input type="text" name = "id" value = "test" /></td>
		</tr>
		<tr>
			<th>성명</th>
			<td><input type="text" name = "name" value ="테스트"/></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name = "email" value = "test@test.com"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value = "저장" /></td>
		</tr>
	</table>
</form>
<a href="<%=request.getContextPath()%>/saram/list.action">리스트로 돌아가기</a>
</body>
</html>