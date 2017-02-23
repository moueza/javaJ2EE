package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Utilisateur;
import metier.LoginService;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	static Logger log = Logger.getLogger(ServletLogin.class.getName());

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// log.debug("ServletLogin");
		log.info("ServletLogin.java");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.getRequestDispatcher("/WEB-INF/chat.jsp").forward(request,
		// response);
		doWork(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doWork(request, response);

	}

	protected void doWork(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String pseudo = "sternisien";
		String pseudo = "";
		// String mdp = "toto";
		String mdp = "";
		System.out.println("ServletLogin.java");
		HttpSession session = request.getSession();
		// if ((session.getAttribute("nom") !=
		// null)&&(session.getAttribute("password") != null)) {
		if (((pseudo = request.getParameter("pseudo")) != null) && ((mdp = request.getParameter("mdp")) != null)) {
			System.out.println("ServletLogin.java if");
			request.setAttribute("pseudo", pseudo);
			request.setAttribute("mdp", mdp);
			// doGet(request, response);
			Utilisateur user = new Utilisateur(pseudo, mdp);
			if (LoginService.getInstance() != null) {

				// TODO cf HashMap
				if (LoginService.getInstance().isGoodLogin(user)) {
					// pas besoin de l entrer dans liste
					System.out.println("ServletLogin.java if if");

					LoginService.getInstance().logUser(user);

					request.getRequestDispatcher("/chat").forward(request, response);
				} else {
					System.out.println("ServletLogin.java if if else");

				}
			} else {
				System.out.println("LoginService.getInstance() NULL");
			}

		} else {
			System.out.println("ServletLogin.java else  cas de base = rien d entré");
			// retour a la page de connexion
			// request.getRequestDispatcher("http://localhost:8080/chat_JEE/servletLogin").forward(request,
			// response);
			//// TODO uncomment for seeing bun
			// request.getRequestDispatcher("http://localhost:8080/chat_JEE/WEB-INF/home.jsp").forward(request,
			// response);
			// System.out.println("ServletChat.java in else if");
			// request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,
			// response);
			request.getRequestDispatcher("/chat").forward(request, response);

		}

	}

}
