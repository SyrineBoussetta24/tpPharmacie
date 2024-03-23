package tpGestionPharmacie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DossierPharmacie {
	
	private String nom ;
	private HashMap <String , Patient >patients ;
	public DossierPharmacie (String n)
	{
		nom =n;
		patients = new HashMap <String , Patient >();
	}
	public void nouveauPatient ( String nom , String []ord ){
		String nomP = nom.toLowerCase(); 
        Patient patient = new Patient(nom);
            for (String medicament : ord) {
                patient.ajoutMedicament(medicament);
            }
            patients.put(nomP, patient);
        }
	public boolean ajoutMedicament (String nom, String m){
		String nomP = nom.toLowerCase(); 
        Patient patient = patients.get(nomP);
        if (patient != null) {
            patient.ajoutMedicament(m);
            return true;
        }
        return false;
	}
	public void affichePatient(String nom) {
        String nomP = nom.toLowerCase(); 
        Patient patient = patients.get(nomP);
        if (patient != null) {
            patient.affiche();
        } else {
            System.out.println("Patient non trouvé.");
        }
    }
	 public void affiche() {
	        System.out.println("Nom de la pharmacie : " + nom);
	        for (Map.Entry<String, Patient> entry : patients.entrySet()) {
	            System.out.println("Patient : " + entry.getKey());
	            entry.getValue().affiche();
	        }
	 }
	 public Collection<String> affichePatientAvecMedicament(String m) {
	        List<String> listp = new ArrayList<>();
	        for (Patient patient : patients.values()) {
	            if (patient.contientMedicament(m)) {
	            	listp.add(patient.getNom());
	            }
	        }
	        return listp;
	    }
}
