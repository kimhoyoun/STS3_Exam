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
<h1>SaramList Ex</h1>
<hr />
<table border ="1", width = "500">
<tr >
	<th>아이디</th>
	<th>성명</th>
	<th>이메일</th>
</tr>
<%-- <%
ArrayList<SaramDto> saramList = (ArrayList)request.getAttribute("saram_list");
for(int i =0; i<saramList.size(); i++){
	SaramDto saram = saramList.get(i);
	System.out.println(saram);
%>

<!-- for문 내부에 반복되는 HTML 문장 -->
	<tr>
		<td><%=saram.getId() %></td>
		<td><%=saram.getName() %></td>
		<td><%=saram.getEmail() %></td>
	</tr>
<%
}
%> --%>
<%
ArrayList<SaramDto> saramList = (ArrayList)request.getAttribute("saram_list");
for(int i =0; i<saramList.size(); i++){
	SaramDto saram = saramList.get(i);
	System.out.println(saram);

// <!-- for문 내부에 반복되는 HTML 문장 -->
	out.println("<tr>");
	out.println("<td>" + saram.getId() +"</td>");	
	out.println("<td>" + saram.getName() +"</td>");	
	out.println("<td>" + saram.getEmail() +"</td>");	
	out.println("</tr>");

}
%>
</table>

</body>
</html>