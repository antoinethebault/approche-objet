package fr.diginamic.maison;

/**
 * @author antoinethebault
 *Piece represente une piece avec deux attributs: une superficie et un numero d'etage
 */
public abstract class Piece {
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
	/**Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}
	/**Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}
	/**Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	/**Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	/**
	 * getType
	 * @return renvoie le type de la piece
	 */
	public abstract String getType();
	
}
