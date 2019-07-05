package itsadeki.recap.heritage;

import java.util.ArrayList;

/**
 * Classe base de donnees qui va enregistrer les utilisateurs
 * 
 * @author itsadeki
 * @version 1.0.0
 * @see https://github.com/itsadeki/JavaRecap
 */
public class Database {
	
	/**
	 * variable qui bloque la base si la connexion n'a pas reussi
	 */
	private Boolean connexion_reussi = false;
	
	/**
	 * variable qui contient la clef de connexion
	 */
	private String clef_secrete = "Luck, je suis ton pére!";
	
	/**
	 * Collection qui va nous servir de base de donnees
	 */
	ArrayList<User> liste_des_utilisateurs = new ArrayList<User>(); 
	
	/**
	 * Methode de connexion à la base
	 * 
	 * @param clef_a_tester
	 * @return la classe elle même avec connexion_reussi a true
	 * ce qui débloque les methodes de la classes
	 */
	public Database connexion(String clef_a_tester) {
		if (clef_a_tester == this.clef_secrete) 
			this.connexion_reussi = true;
		return this;
	}
	
	/**
	 * Methode pour creer une entree dans la base
	 * 
	 * @param clef_a_tester
	 * @return
	 */
	public Boolean create(User user) {
		Boolean succes = false;
		
		if (!this.connexion_reussi)
			return succes;
		else {
			try {
				System.out.println("Un utilisateur à été ajouter");
				this.liste_des_utilisateurs.add(user);
				return succes = true;
			} catch(Error error) {
				System.out.println(error);
				return succes;
			}
		}
	}
	
	/**
	 * Methode pour lire une entree de la base
	 * 
	 * @param id de l'element a afficher
	 * @return succes = true si la recherche est un succes ou false si il y a une erreur
	 */
	public Boolean read(int id) {
		Boolean succes = false;
		
		if (!this.connexion_reussi)
			return succes;
		else {
			try {
				System.out.println(this.liste_des_utilisateurs.get(id));
				return succes = true;
			} catch(Error error) {
				System.out.println(error);
				return succes;
			}
		}
	}
	
	/**
	 * Methode pour lire toutes les entrees de la base
	 * 
	 * @return
	 */
	public Boolean list() {
		Boolean succes = false;
		
		if (!this.connexion_reussi)
			return succes;
		else {
			try {
				for (int i = 0; i < this.liste_des_utilisateurs.size(); i++) {
					System.out.println(this.liste_des_utilisateurs.get(i));
				}
				return succes = true;
			} catch(Error error) {
				System.out.println(error);
				return succes;
			}
		}
	}
}
