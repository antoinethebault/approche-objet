package fr.diginamic.testenumeration;

/**
 * @author antoinethebault
 *TestEnumeration : classe executable testants les enumerations de saison
 */
public class TestEnumeration {

	public static void main(String[] args) {
		
		for (Saison saison: Saison.values()) {
			System.out.println(saison.getLibelle());
		}

		String nom = "ETE" ;
		System.out.println(Saison.valueOf(nom));
		
		String libelle = "Hiver" ;
		System.out.println(Saison.getSaison(libelle));
	}

}
