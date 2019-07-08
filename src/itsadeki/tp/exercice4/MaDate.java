package itsadeki.tp.exercice4;

public class MaDate {

	private int jour;

	private int mois;

	private int annee;



	public MaDate(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}



	public int getJour() {
		return jour;
	}



	public void setJour(int jour) {
		this.jour = jour;
	}



	public int getMois() {
		return mois;
	}



	public void setMois(int mois) {
		this.mois = mois;
	}



	public int getAnnee() {
		return annee;
	}



	public void setAnnee(int annee) {
		this.annee = annee;
	}



	public String toString() {
		return "MaDate ["+jour + "/" + mois + "/" + annee + "]";
	}


	public void ajouterUnJour() {
		this.jour++;

		switch (this.mois) {
			case 1:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 2:
				if(this.jour == 29) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 3:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 4:
				if(this.jour == 31) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 5:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 6:
				if(this.jour == 31) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 7:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 8:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 9:
				if(this.jour == 31) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 10:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 11:
				if(this.jour == 31) {
					this.jour = 1;
					this.mois++;
				}
				break;
			case 12:
				if(this.jour == 32) {
					this.jour = 1;
					this.mois = 1;
					this.annee++;
				}
				break;
		}

	}
	
	public void ajouterPlusieursJours(int n) {
		for (int i = 0; i < n; i++) {
			this.ajouterUnJour();
		}
	}
	
	public void ajouterUnMois() {
		int j = this.jour;
		
		do {
			this.ajouterUnJour();
		}
		while (this.jour != j);
	}
	
	public void ajouterUnAn() {
		this.ajouterPlusieursJours(365);
	}
	
	
	
}
