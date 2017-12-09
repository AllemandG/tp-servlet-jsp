<%@page import="tp.user.UserBean"%>
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
if ( session.getAttribute("loginTry") != null && user == null) {
	message = "Login ou Password incorrect !";
	session.removeAttribute("loginTry");
}

%>
<p>
<%= message %>
</p>

<form action="../public/login" method="post">
	<label for="login">Login : </label>
	<input id="login" name="login" type="text" required="required">
	<br/>
	<label for="passw">Password :</label>
	<input id="passw" name="passw" type="password" required="required">
	<br/>
	<input type="submit" value="Submit">
</form>

</body>
</html>