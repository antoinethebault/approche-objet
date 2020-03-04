package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * classe de compte avec un numero de compte et un solde en attributs
 * et un constructeur permettant de creer une instance
 */
public class Compte {
	private int numeroCompte;
	private int soldeCompte;
	
	/**
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

}
