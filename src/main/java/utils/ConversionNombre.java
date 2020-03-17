package utils;

/**
 * @author antoinethebault
 * conversion d'un nombre en String en integer puis calcul du maximum avec un autre nombre
 */
public class ConversionNombre {

	/**
	 * @param args necessaire a l'execution du main
	 */
	public static void main(String[] args) {
		//declaration des variables
		String nombre = "1234";
		int a = java.lang.Integer.decode(nombre);
		int b=10;
		int max=java.lang.Integer.max(a, b);
		
		//affichage du resultat
		System.out.println(max);
		
	}

}
