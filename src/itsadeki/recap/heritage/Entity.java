package itsadeki.recap.heritage;

/**
 * Classe abstraite qui va �tre h�riter par toutes les autres
 * D�but d'une chaine de filiation d'utilisateur
 * 
 * @author itsadeki
 * @version 1.0.0
 * @see https://github.com/itsadeki/JavaRecap
 */
public abstract class Entity {
	
	/*
	 * Variables
	 * 
	 * On initie des variables propres � tous les types d'utilisateurs
	 * pr�fixer d'un _ pour les differanties des variables propre aux
	 * autres classes
	 * 
	 */
	
	/**
	 * Index
	 * 
	 * Indique sa position dans la base de donn�es
	 */
	protected int _id;
	
	/**
	 * Auth
	 * 
	 * Indique si l'entit� est authentifier
	 */
	protected Boolean _auth;

	/**
	 * Role
	 * 
	 * Indique le role de l'entit�
	 */
	protected String _role;
	
	/*
	 * Getters et Setters
	 * 
	 * Les Getters sont public et les Setters protected
	 * 
	 */
	
	public int get_id() {
		return _id;
	}

	protected void set_id(int _id) {
		this._id = _id;
	}

	public Boolean get_auth() {
		return _auth;
	}

	protected void set_auth(Boolean _auth) {
		this._auth = _auth;
	}

	public String get_role() {
		return _role;
	}

	protected void set_role(String _role) {
		this._role = _role;
	}	

}
