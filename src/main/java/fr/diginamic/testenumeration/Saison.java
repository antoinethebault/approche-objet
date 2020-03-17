package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps",1), ETE("Ete",2), AUTOMNE("Automne",3), HIVER("Hiver",4);
	
	String libelle;
	int numero;
	
	/**Constructor
	 * @param libelle
	 * @param numero
	 */
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	/**Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**Getter
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * getSaison
	 * @param libelle
	 * @return la saison correspondant au libelle
	 */
	public static Saison getSaison(String libelle) {
		for (Saison saison: Saison.values()) {
			if (saison.getLibelle()==libelle) {
				return saison;
			}
		}
		return null;
	}
	
}
