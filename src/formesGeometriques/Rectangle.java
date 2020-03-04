package formesGeometriques;

/**
 * @author antoinethebault
 *
 */
public class Rectangle implements ObjetGeometrique{
	
	/**longueur : double definit la longeur*/
	double longueur;
	/**largeur : double definit la largeur*/
	double largeur;
	
	
	
	/**Constructor
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	
	
	/**Getter
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}



	/**Setter
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}



	/**Getter
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}



	/**Setter
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}



	@Override
	public double perimetre() {
		return longueur*2+largeur*2;
	}
	@Override
	public double surface() {
		return longueur*largeur;
	}
	
}
