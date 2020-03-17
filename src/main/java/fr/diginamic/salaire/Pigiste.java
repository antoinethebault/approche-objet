package fr.diginamic.salaire;

/**
 * @author antoinethebault
 *Pigiste : classe fille de Intervenant
 *represente un employe a la journee
 */
public class Pigiste extends Intervenant {
	/**jours : int nombre de jours travailles pour la societe dans le mois*/
	int jours;
	/**renumeration : double montant journalier de la renumeration*/
	double renumeration;
	
	/**Constructor
	 * @param jours
	 * @param renumeration
	 */
	public Pigiste(String nom, String prenom, int jours, double renumeration) {
		super(nom, prenom);
		this.jours = jours;
		this.renumeration = renumeration;
	}

	@Override
	public double getSalaire() {
		return jours*renumeration;
	}

	@Override
	protected String getType() {
		return "Pigiste";
	}

}
