package itsadeki.tp.exercice2;

public class Stagiaire  {

	public String nom;

	public int[] notes = new int[3];



	public Stagiaire (String nom, int[] notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}

	public double calculerMoyenne() {
		double moyenne;
		int somme = 0;

		for (int i = 0; i < this.notes.length; i++) {
			somme += this.notes[i];
		}

		moyenne = somme/this.notes.length;

		return moyenne;
	}

	public int trouverMax() {
		int max = 0;

		for (int i = 0; i < this.notes.length; i++) {
			if (this.notes[i]>max)
				max = this.notes[i];
		}

		return max;
	}

	public int trouverMin() {
		int min = 0;

		for (int i = 0; i < this.notes.length; i++) {
			if (this.notes[i]<min)
				min = this.notes[i];
		}

		return min;
	}



}
