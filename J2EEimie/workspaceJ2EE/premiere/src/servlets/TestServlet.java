package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//response.getWriter().append("Served at : ").append(request.getContextPath());
		response.getWriter().append("<!DOCTYPE html>"
		+"<html>"
		+"	<head>"
		+"		<meta charset=\"utf-8\">"
		+"		<title>Insert title here</title>"
		+"	</head>"
		+"	<body>"
		+"		<p>Coucou</p>"
		+"<form>Votre nom ?<input></input><input type=\"submit\" value=\"\"></input></form>"
		+"	</body>"
		+"</html>");
		
		*/
		
		/**
		PrintWriter out = response.getWriter();
		out.append("<html>");
		out.append();
		*/
		
		
		/**
		 * */
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewFile.jsp").forward(request, response);

	}
}