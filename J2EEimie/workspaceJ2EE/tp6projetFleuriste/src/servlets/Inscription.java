package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.InscriptionForm;

public class Inscription extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// doGet(request, response);
		// String message = "messag";

		/*
		 * System.out.println("in doPost"); String nom =
		 * request.getParameter("nom"); String mail =
		 * request.getParameter("mail"); //System.out.println("parameter nom=" +
		 * nom); String mdp1 = request.getParameter("mdp1"); String mdp2 =
		 * request.getParameter("mdp2");
		 * 
		 * // request.setAttribute("message envoy", message); //
		 * request.setAttribute("messagee", nom);
		 * 
		 * 
		 * request.setAttribute("nom", nom); request.setAttribute("mail", mail);
		 * request.setAttribute("mdp1", mdp1); request.setAttribute("mdp2",
		 * mdp2);
		 */
		// System.out.println("Inscription :"+request.getAttribute("nom"));
		System.out.println("Inscription :" + request.getParameter("nom"));
		String resultatTraitement = InscriptionForm.getInstance().inscrireUtilisateur(request, response);
		System.out.println("Inscription.java resultatTraitement" + resultatTraitement);

//		switch (resultatTraitement) {
//		case "OK":
//			this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
//			break;
//		case "KO mdp":

		}
	}
}
