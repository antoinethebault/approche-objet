package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

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
		//creation des instances
		Compte compte = new Compte("FR1234567",10000);
		CompteTaux comptePEL = new CompteTaux("FR7654321", 1000, 1.2);
		Compte[] comptes = new Compte[2];
		comptes[0] = compte;
		comptes[1] = comptePEL;
		/** soldeGlobal creation de variable de solde global*/
		int soldeGlobal=0;
		
		//affichage des instances	 
		for (int i=0; i<comptes.length;i++) {
			System.out.println(comptes[i]);
			soldeGlobal+=comptes[i].getSolde();
			if (i==comptes.length-1)
				System.out.println("Solde Global : "+soldeGlobal);
		}

	}

}