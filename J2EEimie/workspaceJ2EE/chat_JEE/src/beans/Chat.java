package beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import metier.IChatService;

public class Chat implements IChatService {

	private static IChatService instance = null;
	
	/**nom utilisateur -> Utilisateur*/
	private HashMap<String, Utilisateur> lesUtilisateurs = new HashMap<String, Utilisateur>();
	private Date dateSession = null;

	public static IChatService getInstance() {

		if (instance == null) {

			instance = new Chat();
		}

		return instance;
	}

	public HashMap<String, Utilisateur> getLesUtilisateurs() {
		return lesUtilisateurs;
	}

	public void setLesUtilisateurs(HashMap<String, Utilisateur> lesUtilisateurs) {
		this.lesUtilisateurs = lesUtilisateurs;
	}

	public Date getDateSession() {
		return dateSession;
	}

	public void setDateSession(Date dateSession) {
		this.dateSession = dateSession;
	}

	// Méthode d'ajout d'un message à un utilisateur
	public Utilisateur ajoutMessageUtilisateurChat(String nom, String message, Date d) {
		Utilisateur u;

		if (this.lesUtilisateurs.get(nom) == null) {

			u = new Utilisateur(nom);
			u.ajoutMessage(message, d);
			this.lesUtilisateurs.put(nom, u);

		} else {
			u = this.lesUtilisateurs.get(nom);
			u.ajoutMessage(message, d);
		}

		return u;
	}

	/** Méthode de récupération des messages de la session de chat
	 * utilisateur -> message*/
	
	public HashMap<String, Message> getMessagesSession() {
		@SuppressWarnings("rawtypes")
		Iterator it = this.lesUtilisateurs.entrySet().iterator();
		HashMap<String, Message> messagesSession = new HashMap<String, Message>();

		while (it.hasNext()) {

			@SuppressWarnings("rawtypes")
			Map.Entry value = (Map.Entry) it.next();
			Utilisateur u = (Utilisateur) value.getValue();

			for (Message m : u.getLesMessages()) {

				messagesSession.put(u.getNom(), m);
			}
		}

		HashMap<String, Message> lesMessages = this.sortHashMap(messagesSession);

		return lesMessages;
	}

	// Méthode de trie des messages par date
	public LinkedHashMap<String, Message> sortHashMap(HashMap<String, Message> dico) {

		Set<Entry<String, Message>> messages = dico.entrySet();

		Comparator<Entry<String, Message>> valueComparator = new Comparator<Entry<String, Message>>() {

			@Override
			public int compare(Entry<String, Message> e1, Entry<String, Message> e2) {
				Message v1 = e1.getValue();
				Message v2 = e2.getValue();
				return v1.getLadate().compareTo(v2.getLadate());
			}
		};

		// Sort method needs a List, so let's first convert Set to List in Java
		List<Entry<String, Message>> listeDeMessages = new ArrayList<Entry<String, Message>>(messages);

		// sorting HashMap by values using comparator
		Collections.sort(listeDeMessages, valueComparator);

		LinkedHashMap<String, Message> sortedByValue = new LinkedHashMap<String, Message>(listeDeMessages.size());

		// copying entries from List to Map
		for (Entry<String, Message> message : listeDeMessages) {
			sortedByValue.put(message.getKey(), message.getValue());
		}

		return sortedByValue;
	}

}
