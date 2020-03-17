package fr.diginamic.testexceptions;

/**
 * @author antoinethebault
 *Operation contient l'operation diviser et diviserRuntime
 * @return 
 */
public class Operation {
	public static double diviser(double a, double b) throws Exception {
		if (b==0)
			throw new DivException("Il est interdit de diviser par 0");
		return a/b;
	}
	public static double diviserRuntime (double a, double b) {
		if (b==0)
			throw new RuntimeException("Il est interdit de diviser par 0");
		return a/b;
	}
}
