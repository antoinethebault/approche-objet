package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

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
		//creation de l'instance
		Compte compte = new Compte("FR1234567",10000);
		
		//affichage de l'instance	 
		System.out.println(compte);

	}

}