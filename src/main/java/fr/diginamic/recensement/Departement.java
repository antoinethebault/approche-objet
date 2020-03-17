package fr.diginamic.recensement;

/**
 * @author antoinethebault
 *Departement represente un departement
 */
public class Departement implements Comparable<Departement>{
	/**code : String*/
	String code;
	/**population : String*/
	int population;
	
	/**Constructor
	 * @param code
	 * @param population
	 */
	public Departement(String code, int population) {
		super();
		this.code = code;
		this.population = population;
	}
	
	/**Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	/**
	 *affiche le nom du departement et sa population
	 */
	public String toString() {
		return code+" Population : "+population;
	}

	@Override
	public int compareTo(Departement o) {
		return this.population-o.getPopulation();
	}
	
}
