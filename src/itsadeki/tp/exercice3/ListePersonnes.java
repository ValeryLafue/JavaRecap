package itsadeki.tp.exercice3;

import java.util.ArrayList;

public class ListePersonnes {
	
	public Personne[] personnes;

	public ListePersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}

	public Personne[] getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}
	
	public Personne findByNom(String s) {
		Personne p = null;
		
		for (Personne personne : personnes) {
			if (personne.getNom() == s)
				p = personne;
		}
		
		return p;
	}
	
	public Boolean findByCodePostal(String cp) {
		Boolean b = false;
		
		for (Personne personne : personnes) {
			if (personne.getAdresses().size()>0) {
				ArrayList<Adresse> adrs = personne.getAdresses();  
				for (int i = 0; i < adrs.size(); i++) {
					if (adrs.get(i).getCodePostal() == cp)
						b = true;
				}
			}
				
		} 
		
		return b;
	}
	
	public int countPersonneVille(String ville) {
		int c = 0;
		
		for (Personne personne : personnes) {
			if (personne.getAdresses().size()>0) {
				ArrayList<Adresse> adrs = personne.getAdresses();
				for (int i = 0; i < adrs.size(); i++) {
					if (adrs.get(i).getVille() == ville)
						c++;
				}
			}
				
		}
		
		return c;
	}
	
	public void editPersonneNom(String oldNom, String newNom) {
		
		for (Personne personne : personnes) {
			if (personne.getNom() == oldNom) {
				personne .setNom(newNom);
			}
		}
		
	}
	
	public void editPersonneVille(String nom, String newVille) {
		
		for (Personne personne : personnes) {
			if (personne.getNom() == nom) {
				ArrayList<Adresse> adresses = new ArrayList<Adresse>();
				adresses.add(new Adresse(null, newVille, null));
				personne.setAdresses(adresses);
			}
		}
		
	}


}
