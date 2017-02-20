<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="metier.InscriptionForm"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="inscription" method="post">
		Nom :<input name="nom"> <br> 
		Mail :<input name="mail">${"KO mdp !".equals(InscriptionForm.getInstance().getResultatTraitement());}


		<br> Mdp1<input name="mdp1">
		<br> Mdp2<input name="mdp2">
		<input type="submit" value="Valider">
	</form>


</body>
</html>