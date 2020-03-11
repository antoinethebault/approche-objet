package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author antoinethebault FusionMap : classe executable pour tester la fusion
 *         de maps
 */
public class FusionMap {
	public static void main(String args[]) {
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		// creation map3 et fusion de map1 et map2
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3 = map1;
		Iterator<Integer> keysIte = map2.keySet().iterator();
		Iterator<String> valuesIte = map2.values().iterator();
		while (keysIte.hasNext()) {
			map3.put(keysIte.next(), valuesIte.next());
		}
		// affichage de map3
		keysIte = map3.keySet().iterator();
		valuesIte = map3.values().iterator();
		while (keysIte.hasNext()) {
			System.out.println(keysIte.next() + " " + valuesIte.next());
		}
	}
}
