package itsadeki.tp.exercice2;

public class Formation {
	
	private String intitule;
	private int nbrJours;
	public Stagiaire[] stagiaires;
	
	public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}
	
	public double calculerMoyenneFormation() {
		double sommeMoyenneFormation = 0.0;
		
		for (int i = 0; i < this.stagiaires.length; i++) {
			sommeMoyenneFormation += this.stagiaires[i].calculerMoyenne();
		}
		
		double moyenneFormation = sommeMoyenneFormation / this.stagiaires.length;
		
		return moyenneFormation;
		
	}
	
	public int getIndexMax() {
		int index = 0;
		double max = 0.0;
		
		for (int i = 0; i < this.stagiaires.length; i++) {
			if (this.stagiaires[i].calculerMoyenne()>max) {
				max = this.stagiaires[i].calculerMoyenne();
				index = i;
			}
				
		}
		
		return index;
	}

	public void afficherNomMax() {
		Stagiaire stagMax = this.stagiaires[this.getIndexMax()];
		System.out.println("le nom du premier stagiaire ayant la\r\n" + 
				"meilleure moyenne d’une formation est " + stagMax.nom);
	}

	public void afficherMinMax() {
		Stagiaire stagMax = this.stagiaires[this.getIndexMax()];
		System.out.println("la note minimale du premier stagiaire ayant\r\n" + 
				"la meilleure moyenne est " + stagMax.trouverMin());
	}

	public void trouverMoyenneParNom(String nom) {
		double moyenne = 0.0;
		
		for (int i = 0; i < this.stagiaires.length; i++) {
			if (this.stagiaires[i].getNom() == nom) {
				moyenne = this.stagiaires[i].calculerMoyenne();
			}
			
		}
		
		System.out.println("La moyenne de "+nom+" est "+moyenne);
	}

}
