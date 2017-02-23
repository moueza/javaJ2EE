package metier;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import beans.Message;
import beans.Utilisateur;

public interface IChatService {
	
	public Utilisateur ajoutMessageUtilisateurChat(String nom, String message, Date d);
	public void setDateSession(Date dateSession);
	public Date getDateSession();
	public HashMap<String, Utilisateur> getLesUtilisateurs();
	public Map<String,Message> getMessagesSession();
	public LinkedHashMap<String, Message> sortHashMap(HashMap<String, Message> dico);
	
}
