package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * @author antoinethebault
 *TestIntervenant : classe executable
 *test la classe Intervenant et ses classes filles : Pigiste et Salarie
 */
public class TestIntervenant {

	/**methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**creation des instances de Pigiste et Salarie*/
		Pigiste pigiste = new Pigiste("Kermarec", "Andre", 10, 100.0);
		Salarie salarie = new Salarie("Kermarec", "Marie", 1400.0);
		
		/**Affichage du salaire des 2 instances*/
		System.out.println(pigiste.afficherDonnees());
		System.out.println(salarie.afficherDonnees());
	}

}
