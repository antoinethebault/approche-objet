package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author antoinethebault
 *CreationEtManipulationMap : classe executable pour tester les maps
 */
public class CreationEtManipulationMap {
	
	public static void main(String args[]) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//parcours les cles puis les valeurs
		//Map.keySet() : set - Map.values() : Collection
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		Iterator<String> valuesIte = mapVilles.values().iterator();
		System.out.print("Liste des departements : ");
		while (keysIte.hasNext())
			System.out.print(keysIte.next()+"-");
		System.out.print("\nListe des villes : ");
		while (valuesIte.hasNext())
			System.out.print(valuesIte.next()+" - ");
		
		//affiche la taille
		System.out.println("\nTaille de la Map : "+mapVilles.size());
	}
	
}