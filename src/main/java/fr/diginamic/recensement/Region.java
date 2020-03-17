package fr.diginamic.recensement;

/**
 * @author antoinethebault
 *Region represente une region
 */
public class Region implements Comparable<Region>{
	/**nom : String*/
	private String nom;
	/**population : int*/
	private int population;
	
	/**Constructor
	 * @param nom
	 * @param population
	 */
	public Region(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	/**
	 *affiche le nom de la region et sa population
	 */
	public String toString() {
		return nom+" Population : "+population;
	}

	@Override
	public int compareTo(Region o) {
		return this.population-o.getPopulation();
	}
	
	
}
