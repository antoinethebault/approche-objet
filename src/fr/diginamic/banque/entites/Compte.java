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
	
	/**
	 *redefinition de la methode toString afin d'afficher le numero de compte et le solde
	 */
	public String toString () {
		return "Numero de compte : "+numero+" Solde : "+solde;
	}

}
