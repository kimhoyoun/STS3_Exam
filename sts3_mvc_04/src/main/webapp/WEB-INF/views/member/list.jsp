<%@page import="org.comstudy21.member.MemberDto"%>
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
<h1>회원 리스트 페이지</h1>
<%
ArrayList<MemberDto> memberList = (ArrayList)request.getAttribute("memberList");
%>


<table border ="1" width = "500">
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이메일</th>
	</tr>
	
	<%
for(int i =0; i<memberList.size(); i++){
	MemberDto member = memberList.get(i);
%>
	<tr>
		<td><%= member.getNo()%></td>
		<td><%=member.getName()%></td>
		<td><%=member.getId()%></td>
		<td><%=member.getPass()%></td>
		<td><%=member.getEmail()%></td>
	</tr>
	<%
	}
	%>
</table>
<hr />
<ul>
	<li><a href="<%= request.getContextPath()%>">홈으로</a></li>
	<li><a href="login.action">로그인</a></li>
</ul>
</body>
</html>