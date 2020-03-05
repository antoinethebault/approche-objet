package essais;

import entites.Cercle;

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
		Cercle cercle1 = new Cercle(5);
		Cercle cercle2 = new Cercle(10);
		System.out.println("Perimetre du cercle1 : "+cercle1.perimetre());
		System.out.println("Surface du cercle1 : "+cercle1.surface());
		System.out.println("Perimetre du cercle2 : "+cercle2.perimetre());
		System.out.println("Surface du cercle2 : "+cercle2.surface());
	}

}
