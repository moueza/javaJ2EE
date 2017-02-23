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
		<div class="chat">
			<form action="ServletChat" method="post">
				<div class="form-group">
					<label>Nom</label> <input class="form-control" name="nom">
				</div>
				<div class="form-group">
					<label>Message</label> <input type="text" class="form-control"
						name="msg">
				</div>
				<input type="submit" class="btn btn-primary" value="Envoyer">
			</form>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>Nom</th>
					<th>Message</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="element" items="${dicoUserMessage}">
					<tr>
						<td><c:out value="${element.key}"></c:out></td>
						<td><c:out value="${element.value.leMessage}"></c:out></td>
						<td><c:out value="${element.value.ladate}"></c:out></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>