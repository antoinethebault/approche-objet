package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

/**classe executable pour tester la manipulation de chaines
 * @author antoinethebault
 *
 */
public class ManipulationChaine {

	/**methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**declaration d'une chaine*/
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		/**affichage de son premier caractere*/
		char premierCaractere = chaine.charAt(0); 
		System.out.println("Premier caractère: " + premierCaractere);
	    
		/**affichage de la taille de la chaine*/
		System.out.println("Taille de la chaine : "+chaine.length());
		
		/**index du premier ;*/
		System.out.println("Index du premier ; : "+chaine.indexOf(';'));
		
		/**extraction du nom de famille*/
		System.out.println("Nom de famille : "+chaine.substring(0,chaine.indexOf(';')));
		
		/**affichage du nom de famille en majuscules*/
		System.out.println("Nom de famille : "+chaine.substring(0,chaine.indexOf(';')).toUpperCase());
		
		/**affichage du nom de famille en minuscules*/
		System.out.println("Nom de famille : "+chaine.substring(0,chaine.indexOf(';')).toLowerCase());
	
		/**decoupage et affichage de la chaine en elements via les ;*/
		String[] tableau = chaine.split(";");
		for (int i=0; i<tableau.length; i++)
			System.out.print(tableau[i]+" ");
		System.out.println();
		
		/**creation d'une instance client et compte a partir des elements issus du decoupage*/
		Personne client = new Personne (tableau[0],tableau[1]);
		Compte compte = new Compte(tableau[2],Double.valueOf(tableau[3].replaceAll(" ", "")));
		
	}

}
