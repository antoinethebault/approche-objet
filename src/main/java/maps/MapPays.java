package maps;

import java.util.HashMap;
import java.util.Iterator;

import sets.Pays;

/**
 * @author antoinethebault
 *MapPays : classe executable permettant de tester les maps avec la classe Pays
 */
public class MapPays {

	public static void main(String[] args) {
		HashMap<String, Pays> map = new HashMap<>();
		map.put("USA",		new Pays("USA", 	372_200_000, 	59_531.66) );
		map.put("France", 	new Pays("France",	66_990_000,		38_476.66));
		map.put("Allemagne",new Pays("Allemagne",82_520_000,	44_469.91));
		map.put("UK", 		new Pays("UK",		66_040_000,		39_720.44));
		map.put("Italie", 	new Pays("Italie",	60_590_000,		31_952.98));
		
		Iterator<Pays> iteValues = map.values().iterator();
		Pays minPays = iteValues.next();
		while(iteValues.hasNext()) {
			Pays pays=iteValues.next();
			if (pays.getNbHabitants()<minPays.getNbHabitants())
				minPays=pays;
		}
		
		map.remove(minPays.getNom());
		
		Iterator<String> iteKeys = map.keySet().iterator();
		while(iteKeys.hasNext())
			System.out.println(iteKeys.next());
	}

}
