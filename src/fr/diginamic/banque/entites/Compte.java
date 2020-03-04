package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * classe de compte avec un numero de compte et un solde en attributs
 * et un constructeur permettant de creer une instance
 */
public class Compte {
	private int numero;
	private int solde;
	
	/**
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	public Compte(int numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}

}
