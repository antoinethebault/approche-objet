package fr.diginamic.testexceptions;

/**
 * @author antoinethebault
 *TestRuntimeException : classe executable testant les exceptions
 */
public class TestRuntimeException {

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
