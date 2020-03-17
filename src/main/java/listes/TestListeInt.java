package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antoinethebault
 * classe executable
 *TestListeInt : on cree une liste avec les elements suivants : -1,5,7,3,-2,4,8,5
 *et on affiche la taille, le plus grand element, la liste sans le plus petit et 
 *on rend la liste positive
 */
public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		System.out.println(liste);
		System.out.println("taille de la liste : "+liste.size());
		System.out.println("le plus grand element : "+max(liste));
		removeSmall(liste);
		System.out.println("La liste sans le plus petit element "+liste);
		makePositive(liste);
		System.out.println("La liste rendue positive "+liste);
	}

	/**
	 * makePositiv : rend tous les nombres negatifs positifs
	 * @param liste
	 */
	private static void makePositive(List<Integer> liste) {
		int element;
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i)<0) {
				element=liste.get(i)*-1;
				liste.remove(i);
				liste.add(i, element);
			}
		}
		
	}

	/**
	 * removeSmall : supprime le plus petit element
	 * @param liste
	 */
	private static void removeSmall(List<Integer> liste) {
		int min = liste.get(0);
		int index = 0;
		for (int i=1; i<liste.size(); i++) {
			if (liste.get(i)<min) {
				min=liste.get(i);
				index=i;
			}
		}
		liste.remove(index);
	}

	/**
	 * max
	 * @param liste
	 * @return le max de la liste
	 */
	private static int max(List<Integer> liste) {
		int max = liste.get(0);
		for (int i=1; i<liste.size(); i++) {
			if (liste.get(i)>max)
				max = liste.get(i);
		}
		return max;
	}

}
