package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * classe de compte avec un numero de compte et un solde en attributs
 * et un constructeur permettant de creer une instance
 */
public class Compte {
	/**
	 * numero 	numero de compte
	 * solde 	solde du compte
	 */
	private String numero;
	private double solde;
	
	/**
	 * @param numeroCompte	numero du compte
	 * @param soldeCompte	solde du compte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.setSolde(solde);
	}
	
	/**
	 *redefinition de la methode toString afin d'afficher le numero de compte et le solde
	 */
	@Override
	public String toString () {
		return "Numero de compte : "+numero+" Solde : "+getSolde();
	}

	/** Getter
	 * @return solde : retourne le solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde : affecte le solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
