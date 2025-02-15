package tpGestionPharmacie;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	private String nom ;
	private Set <String >ordonnance;
	public Patient (String n){
		nom = n ;
		ordonnance = new HashSet <String >();
	}
	public String getNom ()
	{ 
		return nom ;
	}
	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
	}
	public void ajoutMedicament ( String m) {
			 ordonnance.add(m);
	}
	public void affiche() {
		 System.out.println("Nom du patient : " + nom);
	        System.out.println("son ordonnance  : ");
	        for (String medicament : ordonnance) {
	            System.out.println(medicament);
	        }
	}
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
	}
	public void trieOrdonnace() {
		Set<String> ordtrie = new TreeSet<>(ordonnance);
        ordonnance.clear();
        ordonnance.addAll(ordtrie);
	}
}
