package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 *classe debit heritant de operations et de ses attributs de date et montant
 */
public class Debit extends Operations {

	/**Constructor
	 * @param date
	 * @param montant
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}

	/**
	 *renvoie le type de l'operation : Debit
	 */
	public String afficherType() {
		return "Debit";
	}
}
