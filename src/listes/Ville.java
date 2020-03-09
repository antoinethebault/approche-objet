package listes;

/**
 * @author antoinethebault
 *Ville : represente une ville avec un nom et un nombre d'habitants
 */
public class Ville {
	/**nom : String*/
	private String nom;
	/**nbHabitants : int*/
	private int nbHabitants;
	
	/**Constructor
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	public String toString () {
		return this.nom+" : "+this.nbHabitants+" habitants";
	}
}
