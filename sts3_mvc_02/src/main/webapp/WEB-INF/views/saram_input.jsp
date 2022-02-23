<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사람 정보 입력</h1>
<hr />
<!-- 같은 URL로 가더라도 메서드를 다르게 실행할 수 있다. -->
<!-- action엔 실행시킬 메소드 주소, @RequestMapping의 value값-->
<!-- method값을 POST로 하여 input.saram은 같아도 실행시키는 메소드를 구분할 수 있다.-->
<form action="input.saram" method = "POST">
<table>
	<tr>
		<th>아이디</th>
		<td><input type = "text" value="TEST" name ="id"/></td>
	</tr>
	<tr>
		<th>성명</th>
		<td><input type = "text" value="테스형" name ="name"/></td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><input type = "text" value="test@naver.com" name ="email"/></td>
	</tr>
	<tr>
		<th colspan="2">
		<input type = "submit" value ="입력하기" />
		</th>
	</tr>
</table>
</form>
<a href ="<%= request.getContextPath() %>">home으로</a>
</body>
</html>