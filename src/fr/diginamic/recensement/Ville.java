package fr.diginamic.recensement;

/**
 * @author antoinethebault
 *Ville : represente une ville et ses differentes informations
 */
public class Ville implements Comparable<Ville>{
	/**codeRegion : int*/
	private int codeRegion;
	/**nomRegion : String*/
	private String nomRegion;
	/**codeDepartement : int*/
	private String codeDepartement;
	/**codeCommune : int*/
	private int codeCommune;
	/**nomCommune : String*/
	private String nomCommune;
	/**populationTotale : int*/
	private int populationTotale;
	
	/**Constructor
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	/**Getter
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}
	/**Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}
	/**Getter
	 * @return the codeCommune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}
	/**Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}
	/**Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}
	/**Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}
	/**Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	/**Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}
	/**Setter
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	/**Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	/**
	 *affiche les details de la ville
	 */
	public String toString() {
		return this.nomCommune+" - Departement : "+this.codeDepartement+" - Region : "+this.nomRegion+" - Population : "+this.populationTotale;
	}
	
	/**
	 * compareTo 
	 * @param ville
	 * @return renvoie un nombre positif si l'objet compare a une population plus
	 * importante que l'objet pris en parametre
	 * sinon renvoie un nombre negatif
	 */
	public int compareTo(Ville ville) {
		return this.getPopulationTotale()-ville.getPopulationTotale();
	}

	
}
