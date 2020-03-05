package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * @author antoinethebault
 *gere l'affichage des informations de perimetre et de surface de la forme
 */
public class AffichageForme {
	/**afficher : String*/
	public static String afficher (Forme forme) {
		return "perimetre : "+forme.calculerPerimetre()+" - surface : "+forme.calculerSurface();
	}
}
