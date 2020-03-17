package fr.diginamic.formes;

public class Carre extends Rectangle {
	Double longueur;
	
	/**Constructor
	 * @param longueur
	 */
	public Carre(Double longueur) {
		super(longueur, longueur);
		this.longueur=longueur;
	}
	
	@Override
	public double calculerSurface() {
		return longueur*longueur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur*4;
	}

}
