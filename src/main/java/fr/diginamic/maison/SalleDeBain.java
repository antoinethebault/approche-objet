package fr.diginamic.maison;

/**
 * @author antoinethebault
 *SalleDeBain heritant de la classe mere Piece avec une superficie et un numero d'etage
 */
public class SalleDeBain extends Piece {

	/**Constructor
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "SalleDeBain";
	}

}
