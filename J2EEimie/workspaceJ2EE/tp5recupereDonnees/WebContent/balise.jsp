<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Paragraphe</p>
	<%--   comment1 --%>
	<!--   comment2 -->
	<%="hi"%>

	<%!String message = "hello";%>
	<%!public String jaicompris() {
		return "true val";
	}%>
	<%=jaicompris()%>

	<ul>
		<%
			for (int i = 1; i < 3; i++) {
				for (int j = 1; j <= 10; j++) {
					out.println("<li>" + j + "</li>");
				}
			}
		%>


	</ul>

	<%
		String[] animaux = { "chien", "chat", "souris" };
		request.setAttribute("animaux", animaux);
	%>

	${animaux[2]} ${animaux['2']} ${animaux["2"]} ${animaux[5]}


	<%@ page import="java.util.Map"%>
	<%
		Map<String, Integer> desserts = new HashMap<String, Integer>();
		desserts.put("cookies", 8);
		desserts.put("glaces", 3);
		request.setAttribute("desserts", desserts);
	%>
<br>
	${desserts.cookies} <br>
	${desserts.get("cookies")} <br>
	${desserts['cookies']}<br>
	${desserts["cookies"]}

</body>
</html>