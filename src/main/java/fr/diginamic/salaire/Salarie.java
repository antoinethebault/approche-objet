package fr.diginamic.salaire;

/**
 * @author antoinethebault
 *salarie : classe fille de Intervenant represente un salarie du journal avec un contrat
 *de type CDD ou CDI
 */
public class Salarie extends Intervenant {
	/**salaire : double montant du salaire mensuel*/
	double salaire;
	
	/**Constructor
	 * @param salaire
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	@Override
	protected String getType() {
		return "Salarie";
	}

}
