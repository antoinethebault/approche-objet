package fr.diginamic.maison;

/**
 * @author antoinethebault
 *WC heritant de la classe mere piece avec une superficie et un numero d'etage
 */
public class WC extends Piece {

	public WC(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "WC";
	}

}
