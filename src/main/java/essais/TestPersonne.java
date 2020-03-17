package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		//declaration des variables
		Personne personneA = new Personne("Kermarec","Jean");
		Personne personneB = new Personne("Kermarec","Marie");
		AdressePostale adresseA = new AdressePostale(1,"rue des lilas",29000,"Brest");
		AdressePostale adresseB = new AdressePostale(2,"rue des lilas",29000,"Brest");

		//affectation des attributs
		personneA.adresse=adresseA;
		personneB.setAdresse(adresseB);
	}

}
