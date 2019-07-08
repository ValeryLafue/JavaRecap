package itsadeki.tp.exercice1;

import java.util.Scanner;

public class Main {
	// le listner des infos tapper dans la console
	public static Scanner scan = new Scanner(System.in);
	
	// affichage et recption des infos pour creer un point
	public static Point creerUnPoint(String nom) {
		// variables d'un point qqconque
		double abs;
		double ord;
		
		// affichage et recup des donnees
		System.out.println("Creation du point "+nom);
		
		System.out.println("Veuillez precisez l'abscisse du point");
		abs = Main.scan.nextDouble();
		
		System.out.println("Veuillez precisez l'ordonne du point");
		ord = Main.scan.nextDouble();
		
		// retour d'une instance de Point avec les donnees de l'utilisateur
		return new Point(abs, ord);
	}

	public static void main(String[] args) {
		System.out.println(new TroisPoints(Main.creerUnPoint("A"), Main.creerUnPoint("B"), Main.creerUnPoint("C")));
	}

}
