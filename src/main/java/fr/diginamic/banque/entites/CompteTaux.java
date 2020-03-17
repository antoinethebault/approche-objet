package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * va representer le concept de compte remunere genre compte epargne logement, etc...
 */
public class CompteTaux extends Compte{
	/**tauxRemuneration : double taux de remuneration*/
	double tauxRemuneration;

	/**Constructor
	 * @param tauxRemuneration taux de remuneration
	 */
	public CompteTaux(String numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 *redefinition de la methode toString avec le taux de remuneration
	 */
	@Override
	public String toString() {
		return super.toString()+" - Taux de remuneration : "+tauxRemuneration;
	}
	
}
