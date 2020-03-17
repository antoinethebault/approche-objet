package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antoinethebault
 *TestVille classe executable
 *cree des villes avec un nom et un nombre d'habitants et 
 *effectue des operations sur la liste des villes
 */
public class TestVille {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice",343000));
		liste.add(new Ville("Carcassonne",47800));
		liste.add(new Ville("Narbonne",53400));
		liste.add(new Ville("Lyon",484000));
		liste.add(new Ville("Foix",9700));
		liste.add(new Ville("Pau",77200));
		liste.add(new Ville("Marseille",850700));
		liste.add(new Ville("Tarbes",40600));
		System.out.println(searchMost(liste));
		deleteLeast(liste);
		System.out.println(liste);
		toUpperCaseIf(liste);
		System.out.println(liste);
	}

	/**
	 * toUpperCaseIf : met les villes de plus de 100000 habitants en majuscules
	 * @param liste
	 */
	private static void toUpperCaseIf(List<Ville> liste) {
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i).getNbHabitants()>100000) {
				String nom = liste.get(i).getNom().toUpperCase();
				liste.get(i).setNom(nom);
			}
		}
	}

	/**
	 * deleteLeast : supprime la ville la moins peuplee
	 * @param liste
	 */
	private static void deleteLeast(List<Ville> liste) {
		int index = 0;
		int min = liste.get(0).getNbHabitants();
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i).getNbHabitants()<min) {
				index = i;
				min = liste.get(i).getNbHabitants();
			}
		}
		liste.remove(index);
	}

	/**
	 * searchMost
	 * @param liste
	 * @return la ville la plus peuplee
	 */
	private static Ville searchMost(List<Ville> liste) {
		int index = 0;
		int max = liste.get(0).getNbHabitants();
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i).getNbHabitants()>max) {
				index = i;
				max = liste.get(i).getNbHabitants();
			}
		}
		return liste.get(index);
	}

}
