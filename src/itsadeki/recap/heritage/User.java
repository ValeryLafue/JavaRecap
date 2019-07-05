package itsadeki.recap.heritage;

/**
 * Classe utilisateur qui peut s'authentifier
 * 
 * @author itsadeki
 * @version 1.0.0
 * @see https://github.com/itsadeki/JavaRecap
 */
public class User extends Entity {
	
	/*
	 * Variables d'authentification
	 */
	
	/**
	 * Email
	 */
	protected String email;
	
	/**
	 * Mot de passe
	 */
	protected String mot_de_passe;
	
	
	/**
	 * Constructeur de la classe utilisateur
	 * 
	 * @param email
	 * @param mot_de_passe
	 */
	public User(int id, String email, String mot_de_passe) {
		
		// super(); n'est pas utile car le parent est abstrait
		
		// Initialisation des variables utilisateur
		this.email = email;
		this.mot_de_passe = mot_de_passe;
		
		// Initialisation des variables herites
		this._id = id;
		this._role = "Utilisateur";
		this._auth = false;
	}



	/**
	 * Methode d'authentification
	 * 
	 * Remarquez que le if et le else n'ont pas d'accolades {}
	 * Ce n'est pas une erreur
	 * Quand le code à faire ne tient que sur une ligne
	 * on peut le noter de cette maniere
	 */
	public Boolean authenticate(String email_a_verifier, String mot_de_passe_a_verifier) {
		
		// verification
		if (email_a_verifier.equals(this.email) && mot_de_passe_a_verifier.equals(this.mot_de_passe)) // si l'authentification a reussi
			this.set_auth(true); // on set la variable _auth hérité d'Entity à true
		else
			this.set_auth(false); // sinon l'inverse
		
		return this.get_auth(); // et on retourne le resultat quel qu'il soit
	}
	
	/**
	 * toString()
	 * 
	 * @return retour d'une description en chaine de caracteres de l'utilisateur et de son role
	 */
	public String toString() {
		return "User [email=" + email + ", mot_de_passe=" + mot_de_passe + ", _id=" + _id + ", _auth=" + _auth
				+ ", _role=" + _role + "]";
	}
	

}
