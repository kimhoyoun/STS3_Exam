<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>사람 정보 관리 프로그램</h1>

	<P>The time on the server is ${serverTime}.</P>
	<hr />
	<ul>
		<li><a href="member/list.action">고객 정보 관리</a></li>
		<li><a href="saram/list.action">사람 정보 관리</a></li>
	</ul>
	
	
</body>
</html>
