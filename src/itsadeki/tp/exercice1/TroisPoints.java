package itsadeki.tp.exercice1;

public class TroisPoints {
	//	• premier : un attribut priv´e de type Point
	private Point premier;
	//	• deuxi`eme : un attribut priv´e de type Point
	private Point deuxieme;
	//	• troisi`eme : un attribut priv´e de type Point
	private Point troisieme;

	// constructeur
	public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}

	// getters et setters
	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}

	public Point getTroisieme() {
		return troisieme;
	}

	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}

	/**
	 * Methode qui verifie si trois points sont alignés
	 * 
	 * @return true si alignement sinon false
	 */
	public Boolean testerAlignement() {
		// initialisation du retour
		Boolean retour = false;

		// calcul de AB la distance entre le premier et le troisieme point
		double AB = this.premier.calculerDistance(this.troisieme);

		// calcul de AC la distance entre le premier et le deuxieme point
		double AC = this.premier.calculerDistance(this.deuxieme);

		// calcul de BC la distance entre le deuxieme et le troisieme point
		double BC = this.deuxieme.calculerDistance(this.troisieme);

		//test
		if (AB == (AC + BC))
			retour = true;

		// retour
		return retour;
	}

	/**
	 * Methode qui verifie si trois points forme un triangle equilaterale
	 * 
	 * @return
	 */
	public Boolean estTriangleEquilateral() {
		// initialisation du retour
		Boolean retour = false;

		// calcul de AB la distance entre le premier et le troisieme point
		double AB = this.premier.calculerDistance(this.troisieme);

		// calcul de AC la distance entre le premier et le deuxieme point
		double AC = this.premier.calculerDistance(this.deuxieme);

		// calcul de BC la distance entre le deuxieme et le troisieme point
		double BC = this.deuxieme.calculerDistance(this.troisieme);

		//test
		if (AB == AC && AB == BC)
			retour = true;

		// retour
		return retour;
	}

	public String toString() {
		return "TroisPoints [premier=" + premier + ", deuxieme=" + deuxieme + ", troisieme=" + troisieme
				+ ", testerAlignement()=" + testerAlignement() + ", estTriangleEquilateral()="
				+ estTriangleEquilateral() + "]";
	}
	
}
