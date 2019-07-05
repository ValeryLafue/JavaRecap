package itsadeki.recap.heritage;

/**
 * Classe administrateur qui peut gerer les autres utilisateurs
 * 
 * @author itsadeki
 * @version 1.0.0
 * @see https://github.com/itsadeki/JavaRecap
 */
public class Admin extends User{
	
	/**
	 * Clef de connexion a la base de donnee
	 */
	private String clef_secrete = "Luck, je suis ton pére!";

	/**
	 * Constructeur de la classe administrateur
	 * 
	 * @param email
	 * @param mot_de_passe
	 */
	public Admin(int id, String email, String mot_de_passe) {
		super(id, email, mot_de_passe);
		this._role = "Administrateur";
	}

	/**
	 * Getter de la clef secrette
	 * 
	 * @return la clef secrete si l'admin est connecter
	 */
	public String getClef_secrete() {
		if (this._auth)
			return this.clef_secrete;
		else
			return "authentication fail";
	}

}
