package itsadeki.tp.exercice3;

import java.util.ArrayList;

public class Personne {

	private String nom;

	private char sexe;
	
	ArrayList<Adresse> adresses = new ArrayList<Adresse>();

	public Personne(String nom, char sexe, ArrayList<Adresse> adresses) {
		this.nom = nom;
		this.sexe = sexe;
		this.adresses = adresses;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(ArrayList<Adresse> adresses) {
		this.adresses = adresses;
	} 

}
