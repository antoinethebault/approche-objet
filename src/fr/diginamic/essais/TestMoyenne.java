package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author antoinethebault
 *test la classe CalculMoyenne situee dans fr
 */
public class TestMoyenne {

	/**classe executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**moyenne : CalculMoyenne cree une instance et ajoute des elements*/
		CalculMoyenne moyenne = new CalculMoyenne();
		moyenne.ajout(5.0);
		moyenne.ajout(5.0);
		moyenne.ajout(5.0);
		/**moyenne2 : CalculMoyenne cree une instance et ajoute des elements*/
		CalculMoyenne moyenne2 = new CalculMoyenne();
		moyenne2.ajout(0.0);
		moyenne2.ajout(5.0);
		moyenne2.ajout(10.0);
		/**affiche le resultat des moyennes des deux elements*/
		System.out.println(moyenne.calcul());
		System.out.println(moyenne2.calcul());
	}

}
