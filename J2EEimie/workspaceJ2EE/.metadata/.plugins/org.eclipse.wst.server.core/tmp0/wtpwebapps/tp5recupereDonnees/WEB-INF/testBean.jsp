<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="beans.Utilisateur"@%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  String messageRecu=(String) request.getAttribute("messageEnvoye");
out.println(messageRecu);
%>

<% %>
Utilisateur utilisateur = (beans.Utilisateur) request.getAttribute(arg0);
out.println(utilsateur.getPrenon);%>
</body>
</html>