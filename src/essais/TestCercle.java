package essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * @author antoinethebault
 * classe pour tester la classe test situee dans entites
 */
public class TestCercle {

	/**classe executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**creation des instances*/
		Cercle cercle1 = CercleFactory.cercle(5);
		Cercle cercle2 = CercleFactory.cercle(10);
		
		/**Affichage des resultats*/
		System.out.println("Perimetre du cercle1 : "+cercle1.perimetre());
		System.out.println("Surface du cercle1 : "+cercle1.surface());
		System.out.println("Perimetre du cercle2 : "+cercle2.perimetre());
		System.out.println("Surface du cercle2 : "+cercle2.surface());
	}

}
