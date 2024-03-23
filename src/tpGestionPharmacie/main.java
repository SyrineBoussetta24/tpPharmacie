package tpGestionPharmacie;

public class main {
	public static void main(String[] args) {

		Patient patient1 = new Patient("syrine");
        System.out.println("Patient 1 : " + patient1.getNom());

        patient1.ajoutMedicament("Paracetamol");
        patient1.ajoutMedicament("doliprane");

       
        patient1.affiche();

        System.out.println("Tri de l'ordonnance de patient 1 :");
        patient1.trieOrdonnace();
        patient1.affiche();

        DossierPharmacie pharmacie = new DossierPharmacie("pharma");

        pharmacie.nouveauPatient("amal", new String[]{"aa", "bb"});
        pharmacie.nouveauPatient("ranim", new String[]{"cc", "dd"});

        pharmacie.affiche();

        pharmacie.ajoutMedicament("amal", "aa");
        pharmacie.ajoutMedicament("ranim", "bb");

        pharmacie.affichePatient("amal");

        System.out.println( pharmacie.affichePatientAvecMedicament("aa"));
    }

}
