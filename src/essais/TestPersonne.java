package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		//declaration des variables
		Personne personneA = new Personne();
		Personne personneB = new Personne();
		AdressePostale adresseA = new AdressePostale();
		AdressePostale adresseB = new AdressePostale();

		//affectation des attributs
		personneA.nom="Kermarec";
		personneA.prenom="Jean";
		adresseA.numeroRue=1;
		adresseA.libelleRue="rue des lilas";
		adresseA.codePostal=29000;
		adresseA.ville="Brest";
		personneA.adresse=adresseA;
		
		personneB.nom="Kermarec";
		personneB.prenom="Marie";
		adresseB.numeroRue=1;
		adresseB.libelleRue="rue des lilas";
		adresseB.codePostal=29000;
		adresseB.ville="Brest";
		personneB.adresse=adresseA;
	}

}
