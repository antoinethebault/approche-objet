package fr.diginamic.testexceptions;

/**
 * @author antoinethebault
 *TestException : classe executable, teste les exceptions
 */
public class TestException {

	public static void main(String[] args) {
		try {
			System.out.println(Operation.diviser(6, 3));
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		try {
			System.out.println(Operation.diviser(6, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}

	}

}
