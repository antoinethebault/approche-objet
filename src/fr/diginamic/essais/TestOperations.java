package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * @author antoinethebault
 *test le resultat des operations
 */
public class TestOperations {

	/**classe executable
	 * @param args
	 */
	public static void main(String[] args) {
		if (!((5+3)==Operations.calcul(5,3,'+')))
			System.out.println("+ : false");
		if (!((5-3)==Operations.calcul(5,3,'-')))
			System.out.println("- : false");
		if (!((5*3)==Operations.calcul(5,3,'*')))
			System.out.println("* : false");
		if (!((6/3)==Operations.calcul(6,3,'/')))
			System.out.println("/ : false");

	}

}
