package itsadeki.tp.exercice2;

public class Main {

	public static Stagiaire createStagiaire(String nom, int note1, int note2, int note3) {
		int[] notes = {note1, note2, note3};
		return new Stagiaire(nom, notes);
	}

	public static void main(String[] args) {

		Stagiaire[] stagiaires = {
			Main.createStagiaire("Machin1", 0, 1, 2), 
			Main.createStagiaire("Machin2", 10, 11, 20), 
			Main.createStagiaire("Machine", 10, 11, 20)
		};

		Formation java = new Formation("Java", 86, stagiaires);
		
		System.out.println("La moyenne de tous les stagiaires est "+java.calculerMoyenneFormation());
		
		
		
		java.afficherNomMax();
		
		java.afficherMinMax();
		
		java.trouverMoyenneParNom("Machine");
		

	}

}
