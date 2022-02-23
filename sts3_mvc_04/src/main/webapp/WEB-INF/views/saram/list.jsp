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
<%
ArrayList<SaramDto> saramList = (ArrayList)request.getAttribute("saramList");
%>
<h1>사람 정보 리스트 페이지</h1>
<form action="">
	<table border = "1" width = "550">
		<tr>
			<th>고유 번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>
		<%
		for(int i =0; i<saramList.size(); i++){
			SaramDto saram = saramList.get(i);
		%>
		<tr>
			<td><%=saram.getIdx() %></td>
			<td><%=saram.getId() %></td>
			<td><a href="detail.action?idx=<%=saram.getIdx()%>"><%=saram.getName()%></a></td>
			<td><%=saram.getEmail() %></td>
		</tr>
		
		<%
		}
		%>
	</table>
</form>
<hr />
<ul>
	<li><a href="<%= request.getContextPath()%>">홈으로</a></li>
	<li><a href="<%= request.getContextPath()%>/saram/input.action">추가</a></li>
</ul>
</body>
</html>