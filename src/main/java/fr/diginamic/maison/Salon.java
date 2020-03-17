package fr.diginamic.maison;

/**
 * @author antoinethebault
 *Salon heritant de la classe mere Piece avec une superficie et un numero d'etage
 */
public class Salon extends Piece {

	/**Constructor
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "Salon";
	}

}
