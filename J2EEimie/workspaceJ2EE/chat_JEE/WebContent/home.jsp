<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script type="text/javascript"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2>LOGIN</h2>
		<form action="ServletLogin">
			<div class="form-group">
				<label>Pseudo</label>
				<input type="text"class="form-control" name="pseudo">
			</div>
			<div class="form-group">
				<label>Mot de passe</label>
				<input type="pseudo" class="form-control" name="mdp">
			</div>
			<input type="submit" class="btn btn-primary" value="Envoyer">
		</form>
	</div>
</body>
</html>