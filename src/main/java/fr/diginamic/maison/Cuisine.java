package fr.diginamic.maison;

/**
 * @author antoinethebault
 *Cuisine heritant de la classe mere Piece avec une superficie et un numero d'etage
 */
public class Cuisine extends Piece {

	/**Constructor
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "Cuisine";
	}

}
