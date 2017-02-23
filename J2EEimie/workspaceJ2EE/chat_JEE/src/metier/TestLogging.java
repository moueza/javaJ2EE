package metier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;

import beans.Chat;
import beans.Message;
import beans.Utilisateur;

public class TestLogging {
	static Logger log = Logger.getLogger(TestLogging.class.getName());

	public static void main(String[] args) {
		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		Chat.getInstance().setDateSession(new Date());

		System.out.println(Chat.getInstance().getDateSession());
		String message = "hello world";
		String nom = "Ternisien";
		Chat.getInstance().ajoutMessageUtilisateurChat(nom, message, new Date());
		HashMap m = Chat.getInstance().getLesUtilisateurs();

		Utilisateur u = (Utilisateur) Chat.getInstance().ajoutMessageUtilisateurChat("Toto", message, new Date());
		Map<String, Message> messages = new HashMap<String, Message>();

		Chat.getInstance().getMessagesSession();

	}

}
