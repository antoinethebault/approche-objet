package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author antoinethebault
 * classe executable
 *test la classe Forme et ses differentes classes filles: cercle, rectangle et carre
 *notamment pour l'affichage des perimetres et surfaces via AffichageForme
 */
public class TestForme {

	/**main : methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**creation d'instances de cercle, rectangle et carre*/
		Cercle cercle = new Cercle(5.0);
		Rectangle rectangle = new Rectangle (5.0,3.0);
		Carre carre = new Carre(5.0);

		/**utilisation de la methode afficher de la classe AffichageForme*/
		System.out.println(AffichageForme.afficher(cercle));
		System.out.println(AffichageForme.afficher(rectangle));
		System.out.println(AffichageForme.afficher(carre));
	}

}
