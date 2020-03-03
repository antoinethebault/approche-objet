package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		//declaration des variables
		String nombre = "1234";
		int nombreConverti = java.lang.Integer.decode(nombre);
		int a=5, b=10;
		int max=java.lang.Integer.max(a, b);
		
		//affichage du resultat
		System.out.println(max);
		
	}

}
