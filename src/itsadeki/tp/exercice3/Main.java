package itsadeki.tp.exercice3;

import java.util.ArrayList;

public class Main {
	
	public static Personne createPersonne(String nom, char sexe, String rue, String ville, String codePostal) {
		Adresse adr = new Adresse(rue, ville, codePostal);
		ArrayList<Adresse> adresses = new ArrayList<Adresse>();
		adresses.add(adr);
		return new Personne(nom, sexe, adresses);
	}

	public static void main(String[] args) {
		Personne[] personnes = {
				Main.createPersonne("Machin", 'M', "Boulevard moulin", "Pau", "64000"),
				Main.createPersonne("Machin2", 'M', "Boulevard moulin", "Pau", "64000"),
				Main.createPersonne("Machine", 'F', "Boulevard moulin", "Pau", "64000")
		};
		
		ListePersonnes test = new ListePersonnes(personnes);
		
		System.out.println("Pau: "+test.countPersonneVille("Pau")+" Personne(s)");
		
		System.out.println(test.findByCodePostal("64420"));
		
	}

}
