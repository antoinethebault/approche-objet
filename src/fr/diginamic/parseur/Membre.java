package fr.diginamic.parseur;

/**
 * @author antoinethebault
 *Membre representant une variable ou une constante
 */
public class Membre {
	private String nom;
	private double value;
	
	/**Constructor
	 * @param nom
	 */
	public Membre(String nom) {
		super();
		this.nom = nom;
	}
	
	/**Constructor
	 * @param value
	 */
	public Membre(double value) {
		super();
		this.value = value;
	}

	/**Getter
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
}
