package metier;

import beans.Utilisateur;

public interface ILoginService {
	boolean isGoodLogin(Utilisateur u);
}
