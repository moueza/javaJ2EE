package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulairee
 */
@WebServlet("/Formulairee")
public class Formulairee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Formulairee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// // TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		/*
		 * response.getWriter().append("Served at: "
		 * ).append(request.getContextPath());
		 * this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp")
		 * .forward(request, response);
		 */
		//String message = new String("Nom ms mess");
		//request.setAttribute(, nom);
		//request.setAttribute("nom", nom);
		//String nom=request.getParameter("nom");
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
