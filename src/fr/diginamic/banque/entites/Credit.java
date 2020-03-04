package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 *classe credit heritant de operations et de ses attributs de date et montant
 */
public class Credit extends Operations {

	/**Constructor
	 * @param date
	 * @param montant
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	/**
	 *renvoie le type de l'operation : Credit
	 */
	public String afficherType() {
		return "Credit";
	}

}
