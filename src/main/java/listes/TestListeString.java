package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antoinethebault
 *TestListeString : classe executable
 *on cree une liste avec les elements suivants : Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
 *puis on sort la ville qui a le plus le grand nombre de lettres
 *on met toutes les villes en majuscule dans la liste
 *on supprime les villes commencant par 'N'
 */
public class TestListeString {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		System.out.println(plusGrandNombreLettres(liste));
		toUpperCase(liste);
		System.out.println(liste);
		removeN(liste);
		System.out.println(liste);
	}

	/**
	 * removeN : supprime les villes commencants par N
	 * @param liste
	 */
	private static void removeN(List<String> liste) {
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i).startsWith("N"))
				liste.remove(i);
		}
	}

	/**
	 * toUpperCase : rend les elements de la liste en majuscule
	 * @param liste
	 */
	private static void toUpperCase(List<String> liste) {
		String element;
		for (int i=0; i<liste.size(); i++) {
			element = liste.get(i).toUpperCase();
			liste.remove(i);
			liste.add(i, element);
		}	
	}

	/**
	 * plusGrandNombreLettres
	 * @param liste
	 * @return l element de la liste qui a le plus grand nombre de lettre
	 */
	private static String plusGrandNombreLettres(List<String> liste) {
		int max = liste.get(0).length();
		int index = 0;
		for (int i=1; i<liste.size(); i++) {
			if (liste.get(i).length()>max) {
				max = liste.get(i).length();
				index = i;
			}
		}
		return liste.get(index);
	}

}
