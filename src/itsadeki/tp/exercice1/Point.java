package itsadeki.tp.exercice1;

public class Point {
	// variables
	private double abs;
	private double ord;
	
	//constructeur
	public Point(double abs, double ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}
	
	//getters et setters
	public double getAbs() {
		return abs;
	}
	
	public void setAbs(double abs) {
		this.abs = abs;
	}
	
	public double getOrd() {
		return ord;
	}
	
	public void setOrd(double ord) {
		this.ord = ord;
	}
	
	/**
	 * Methode de calcul de distance entre this et un autre point
	 * 
	 * @param p
	 * @return
	 */
	public double calculerDistance(Point p) {
		// calcul du carre de la formule (disponible dans le tp)
		double xcarre = (this.abs - p.abs) * (this.abs - p.abs) + (this.ord - p.ord) * (this.ord - p.ord);
		
		// calcul de la racine
		double x = Math.sqrt(xcarre);
		
		// retour de la reponse
		return x;
	}
	
	public Point calculerMilieu(Point p) {
		
		// calcul de l'abscisse du milieu
		double xM = (this.abs + p.abs) / 2;
		
		// calcul de l'ordonnee du milieu
		double yM = (this.ord + p.ord) / 2;
		
		// retour de la reponse sous forme de Point
		Point mid = new Point(xM, yM);
		return mid;
	}

	public String toString() {
		return "Point [abs=" + abs + ", ord=" + ord + "]";
	}
	
}
