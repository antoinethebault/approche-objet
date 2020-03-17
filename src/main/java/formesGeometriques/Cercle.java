package formesGeometriques;

import formesGeometriques.ObjetGeometrique;

/**
 * @author antoinethebault
 *
 */
public class Cercle implements ObjetGeometrique{
	/**rayon : double definit le rayon du cercle*/
	double rayon;
	
	/**Constructor
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	

	/**Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}



	/**Setter
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}



	@Override
	public double perimetre() {
		return 2*Math.PI*rayon;
	}

	@Override
	public double surface() {
		return Math.PI*rayon*rayon;
	}
}
