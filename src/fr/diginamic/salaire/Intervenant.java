package fr.diginamic.salaire;

/**
 * @author antoinethebault
 *classe mere de salarie et pigiste
 */
public abstract class Intervenant {
	/**nom : String*/
	private String nom;
	/**prenom : String*/
	private String prenom;
	
	/**Constructor
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return le salaire de l'intervenant
	 */
	public abstract double getSalaire();
	
	/**
	 * @return le nom, le prenom, le salaire et le statut de l'intervenant
	 */
	public String afficherDonnees() {
		return nom+" "+prenom+" "+getSalaire()+"€ mensuel "+getType();
	}

	/**
	 * @return le type d'intervenant : salarie ou pigiste
	 */
	protected abstract String getType();
	
	
}
