package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * classe de compte avec un numero de compte et un solde en attributs
 * et un constructeur permettant de creer une instance
 */
public class Compte {
	private String numero;
	private double solde;
	
	/**
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

}
