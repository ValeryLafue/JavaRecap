package itsadeki.recap.heritage;

/**
 * Classe qui sert à initier le projet dans la console Java
 * 
 * @author itsadeki
 * @version 1.0.0
 * @see https://github.com/itsadeki/JavaRecap
 */
public class Console {
	/**
	 * Variables de test
	 */
	public static Database bdd;
	public static User patrick;
	public static Admin superUser;
	
	/**
	 * Initialisation
	 * 
	 * Ajouter autant d'utilisateur que vous voulez
	 */
	public static void init() {
		Console.bdd = new Database();
		Console.patrick = new User(0, "patrick@email.fr", "mot_de_passe");
		Console.superUser = new Admin(0, "super@email.fr", "root");

		//System.out.println(Console.patrick);
		//System.out.println(Console.superUser);
	}
	
	/**
	 * Connexion des testeurs
	 * 
	 * Pour tester la methode de connexion des utilisateurs et admin
	 */
	public static void testConnection() {
		Console.patrick.authenticate("patrick@email.fr", "mot_de_passe");
		Console.superUser.authenticate("super@email.fr", "root");

		//System.out.println(Console.patrick);
		//System.out.println(Console.superUser);
	}
	
	/**
	 * 
	 */
	public static void testDatabase() {
		Console.bdd.connexion(superUser.getClef_secrete()).create(patrick);
		Console.bdd.connexion(superUser.getClef_secrete()).list();
	}

	public static void main(String[] args) {

		Console.init();
		
		Console.testConnection();
		
		Console.testDatabase();

	}

}
