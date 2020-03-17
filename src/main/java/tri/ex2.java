package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import sets.Pays;

/**
 * @author antoinethebault
 *ex2 : classe executable : teste le tri
 */
public class ex2 {

	public static void main(String[] args) {
		ArrayList<Pays> liste = new ArrayList<>();
		liste.add(new Pays("USA", 	372_200_000, 	59_531.66));
		liste.add(new Pays("France",	66_990_000,		38_476.66));
		liste.add(new Pays("Allemagne",82_520_000,	44_469.91));
		liste.add(new Pays("UK",		66_040_000,		39_720.44));
		liste.add(new Pays("Italie",	60_590_000,		31_952.98));
		
		Collections.sort(liste, new ComparatorPibHabitant());
		
		Iterator<Pays> ite = liste.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());


	}

}
