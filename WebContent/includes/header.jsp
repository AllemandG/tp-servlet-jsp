<%@page import="tp.user.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library</title>
</head>
<body>

<%
String message = "";
UserBean user = (UserBean) session.getAttribute("USER");
if (user != null) {
	message = "Bienvenu "+ user.getLogin() +", vous êtes connecté depuis "+ user.getLoginDate() +".";
} else {
	response.sendRedirect("../public/login.jsp");
}
%>
<p><%= message %><a href="../private/logout">Se déconnecter</a></p>