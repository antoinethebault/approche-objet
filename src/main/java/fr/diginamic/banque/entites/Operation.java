package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 * classe abstraite gerant les debits et les credits pour un montant a une date definie
 */
public abstract class Operation {
	/**date : String 	date de l'operation*/
	private String date;
	/**montant : double montant de l'operation*/
	private double montant;
	
	/**Constructor
	 * @param date
	 * @param montant
	 */
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	/**Getter
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**Setter
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	/** renvoie le type d'operation
	 * @return
	 */
	public abstract String afficherType();
		
}
