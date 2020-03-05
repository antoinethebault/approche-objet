package fr.diginamic.maison;

/**
 * @author antoinethebault
 *Piece represente une piece avec deux attributs: une superficie et un numero d'etage
 */
public class Piece {
	/**superficie : double*/
	double superficie;
	/**etage : int numero d'etage avec 0 en RDC*/
	int etage;
	/**Constructor
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
	
	
}
