package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author antoinethebault
 *testPays : classe executable, teste la classe Pays
 */
public class testPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("USA", 	372_200_000, 	59_531.66));
		set.add(new Pays("France",	66_990_000,		38_476.66));
		set.add(new Pays("Allemagne",82_520_000,	44_469.91));
		set.add(new Pays("UK",		66_040_000,		39_720.44));
		set.add(new Pays("Italie",	60_590_000,		31_952.98));
		set.add(new Pays("Japon",	126_800_000,	38_428.10));
		set.add(new Pays("Chine",	1_386_000_000,	8_826.99));
		set.add(new Pays("Russie",	144_500_000,	10_743.10));
		set.add(new Pays("Inde",	1_339_000_000,	1_939.61));
		System.out.println("PIB/habitant max : "+pibHabitantMax(set));
		System.out.println("PIB total max : "+pibTotalMax(set));
		pibHabitantMinMaj(set);
		System.out.println(set);
		System.out.println("test egalite :"+new Pays("USA", 	372_200_000, 	59_531.66).equals(new Pays("USA", 	372_200_000, 	59_531.66)));
		System.out.println("test egalite :"+new Pays("USA", 	372_200_000, 	59_531.66).equals(new Pays("US", 	372_200_000, 	59_531.66)));
	}

	/**
	 * pibTotalMax
	 * @param set
	 * @return le pib total max
	 */
	private static Pays pibTotalMax(HashSet<Pays> set) {
		Iterator<Pays> iterator = set.iterator();
		Pays element;
		Pays paysMax = iterator.next();
		double max = paysMax.getPibParHabitant()*paysMax.getNbHabitants();
		while (iterator.hasNext()) {
			element=iterator.next();
			if (element.getPibParHabitant()*element.getNbHabitants()>max) {
				max=element.getPibParHabitant()*element.getNbHabitants();
				paysMax=element;
			}
		}
		return paysMax;
	}

	/**
	 * pibHabitantMax
	 * @param set
	 * @return le pays avec le pib par habitant max
	 */
	private static Pays pibHabitantMax(HashSet<Pays> set) {
		Iterator<Pays> iterator = set.iterator();
		Pays element;
		Pays paysMax = iterator.next();
		double max = paysMax.getPibParHabitant();
		while (iterator.hasNext()) {
			element=iterator.next();
			if (element.getPibParHabitant()>max) {
				max=element.getPibParHabitant();
				paysMax=element;
			}
		}
		return paysMax;
	}
	
	/**
	 * pibHabitantMinMaj
	 * @param set
	 * met le pays avec le pib minimum en majuscules
	 */
	private static void pibHabitantMinMaj(Set<Pays> set) {
		Iterator<Pays> iterator = set.iterator();
		Pays element;
		Pays paysMin = iterator.next();
		double min = paysMin.getPibParHabitant();
		while (iterator.hasNext()) {
			element=iterator.next();
			if (element.getPibParHabitant()<min) {
				min=element.getPibParHabitant();
				paysMin=element;
			}
		}
		set.remove(paysMin);
		paysMin.setNom(paysMin.getNom().toUpperCase());
		set.add(paysMin);
	}
	
	

}
