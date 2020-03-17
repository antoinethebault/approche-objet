package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author antoinethebault
 *TestSetString : classe executable
 *contient un HashSet avec USA,France,Allemagne,UK,Italie,Japon,Chine,Russie,Inde
 *des operations sont effectuees dessus
 */
public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList("USA","France","Allemagne","UK","Italie","Japon","Chine","Russie","Inde"));
		System.out.println(set);
		System.out.println(maxLetters(set));
		set.remove(maxLetters(set));
		System.out.println(set);
		
	}

	/**
	 * maxLetters
	 * @param set
	 * @return celui qui a le plus de lettres
	 */
	private static String maxLetters(HashSet<String> set) {
		Iterator<String> iterator = set.iterator(); 
		String element;
		String elementMax=iterator.next();
		int max=elementMax.length();
		while (iterator.hasNext()) {
			element=iterator.next();
			if (element.length()>max) {
				max=element.length();
				elementMax=element;
			}
		}
		return elementMax;
	}

}
