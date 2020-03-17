package listes;

import java.util.ArrayList;

/**
 * @author antoinethebault
 *CreationListe : insertion de 100 chiffres 1 a 100 dans la liste et affichage de sa taille
 *classe executable
 */
public class CreationListe {
	public static void main (String args[]) {
		ArrayList<Integer> liste = new ArrayList<>();
		for (int i=1; i<=100; i++)
			liste.add(i);
		System.out.println(liste.size());	
	}
}
