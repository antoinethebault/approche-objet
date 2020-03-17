package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author antoinethebault
 *TestSetDouble : classe executable
 *instanciation d'un hashset avec les valeurs suivantes : 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
 *et effectue des operations dessus
 */
public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> liste = new HashSet<>();
		liste.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		System.out.println(liste);
		System.out.println("Le max : "+getMax(liste));
		Object min = Collections.min(liste);
		liste.remove(min);
		System.out.println("La liste sans le min : "+liste);
	}

	public static double getMax(HashSet<Double> liste) {
		Iterator<Double> iterator = liste.iterator(); 
		Double max = iterator.next();
		Double element;
		while (iterator.hasNext()) {
			element=iterator.next();
			if (element>max)
				max=element;
		}
		return max;
	}
	
}
