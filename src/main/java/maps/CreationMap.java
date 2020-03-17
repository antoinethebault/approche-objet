package maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author antoinethebault
 *CreationMap : classe executable permettant de tester les maps
 */
public class CreationMap {

	public static void main(String[] args) {
		/**hm : Map<String, Integer> : contient le nom et le salaire des employes*/
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Paul", 1750);
		hm.put("Hicham",1825);
		hm.put("Yu",2250);
		hm.put("Ingrid",2015);
		hm.put("Chantal",2418);
		System.out.println("Taille de la map : "+hm.size());
	}

}
