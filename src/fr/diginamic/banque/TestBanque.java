package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

/**
 * @author antoinethebault
 *classe permettant de tester la classe Banque
 */
public class TestBanque {

	/**
	 * @param args
	 * executable de test de la classe banque
	 */
	public static void main(String[] args) {
		/**
		 * compte, comptePEL, compte[]
		 * creation des instances de compte et d'un tableau contenant les instances*/
		Compte compte = new Compte("FR1234567",10000);
		CompteTaux comptePEL = new CompteTaux("FR7654321", 1000, 1.2);
		Compte[] comptes = new Compte[2];
		comptes[0] = compte;
		comptes[1] = comptePEL;
		/** soldeGlobal creation de variable de solde global*/
		int soldeGlobal=0;
		
		/**ajout d'operations*/
		compte.ajouterOperation(new Debit("01/01/20",100));
		compte.ajouterOperation(new Credit("02/01/20",50));
		compte.ajouterOperation(new Credit("03/01/20",25));
		
		/**affichage des instances et du solde global	*/ 
		for (int i=0; i<comptes.length;i++) {
			System.out.println(comptes[i]);
			soldeGlobal+=comptes[i].getSolde();
			if (i==comptes.length-1)
				System.out.println("Solde Global : "+soldeGlobal);
		}
		
		/**affichage du solde des credits et des debits effectues sur compte*/
		System.out.println("Solde des credits sur compte : "+compte.getSolde("CREDIT"));
		System.out.println("Solde des debits sur compte : "+compte.getSolde("DEBIT"));

	}

}