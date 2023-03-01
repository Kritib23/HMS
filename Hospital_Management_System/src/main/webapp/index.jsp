<%@page import="com.db.DBconnect"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<%@include file="component/all_css.jsp"%>

</head>
<body>
	<%@include file="component/nav_bar.jsp"%>

	<%
	Connection conn = DBconnect.getConn();
	out.print(conn);
	%>
	<h1>Hello World!</h1>



</body>
</html>