package metier;

import org.apache.log4j.Logger;

import beans.Chat;
import beans.Utilisateur;

public class LoginService implements ILoginService {
	private static LoginService instance;
	static Logger log = Logger.getLogger(LoginService.class.getName());

	private LoginService() {
		System.out.println("LoginService constructor");
	}

	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
		}
		return instance;
	}

	@Override
	public boolean isGoodLogin(Utilisateur u) {
		boolean registered = Chat.getInstance().getLesUtilisateurs().containsValue(u);
		if (registered) {

		} else {
			// https://www.tutorialspoint.com/log4j/log4j_sample_program.htm
			/* Get actual class name to be printed on */
			log.debug("Unregistered");
			log.info("LoginService.java");
		}
		return registered;
	}

	public void logUser(Utilisateur user) {

	}

}
