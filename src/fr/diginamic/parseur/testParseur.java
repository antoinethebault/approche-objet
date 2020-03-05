package fr.diginamic.parseur;

/**
 * @author antoinethebault
 *testParseur
 */
public class testParseur {

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine="3*x";
		Expression expr=Parser.parse(chaine);
		double resultat = expr.evaluer("x", 2.5);
		System.out.println(resultat);
		
	}

}
