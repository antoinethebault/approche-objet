package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

/**
 * @author antoinethebault Application : classe executable point d'entree de
 *         l'application
 */
public class Application {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		load(villes);
		System.out.println(getVille("Montpellier", villes));
		System.out.println("Population de l'Herault : " + getPopulationDepartement("34", villes));
		System.out.println("Plus petite ville du departement : " + getPlusPetiteVille("34", villes));
		dixPlusGrandesVilles("34", villes);
		dixPlusPetitesVilles("34", villes);
		System.out.println("Population de l'Occitanie : " + getPopulationRegion("Occitanie", villes));
		dixPlusGrandesVillesRegion("Occitanie", villes);
		departementPlusImportantRegion("Occitanie", villes);
		dixRegionsPlusPeuples(villes);
		dixDepartmtsPlusPeuples(villes);
		dixPlusGrandesVilles(villes);
	}

	/**
	 * load : charge le fichier dans la liste villes
	 * 
	 * @param villes
	 */
	public static void load(ArrayList<Ville> villes) {
		String[] decoupe;
		try {
			File file = new File("/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			boolean firstLine = true;

			for (String ligne : lignes) {
				if (!firstLine) {
					decoupe = ligne.split(";");
					villes.add(
							new Ville(Integer.valueOf(decoupe[0]), decoupe[1], decoupe[2], Integer.valueOf(decoupe[5]),
									decoupe[6], Integer.parseInt(decoupe[9].replaceAll("\\D", ""))));
				} else
					firstLine = false;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * getVille : recherche une ville par son nom dans liste des villes
	 * 
	 * @param nom
	 * @param villes
	 * @return la ville trouvee, null sinon
	 */
	public static Ville getVille(String nom, ArrayList<Ville> villes) {
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		while (iterator.hasNext()) {
			ville = iterator.next();
			if (ville.getNomCommune().equals(nom))
				return ville;
		}
		return null;
	}

	/**
	 * getPopulationDepartement
	 * 
	 * @param code   : code du departement
	 * @param villes : la liste des villes
	 * @return : la population du departement
	 */
	public static int getPopulationDepartement(String code, ArrayList<Ville> villes) {
		int population = 0;
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		while (iterator.hasNext()) {
			ville = iterator.next();
			if (ville.getCodeDepartement().equals(code))
				population += ville.getPopulationTotale();
		}
		return population;
	}

	/**
	 * getPopulationRagion
	 * 
	 * @param nom    : nom de la region
	 * @param villes : la liste des villes
	 * @return : la population de la region
	 */
	public static int getPopulationRegion(String nom, ArrayList<Ville> villes) {
		int population = 0;
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		while (iterator.hasNext()) {
			ville = iterator.next();
			if (ville.getNomRegion().equals(nom))
				population += ville.getPopulationTotale();
		}
		return population;
	}

	/**
	 * getPlusPetiteVille : du departement
	 * 
	 * @param code   : du departement
	 * @param villes : liste de toutes les villes de france
	 * @return la ville la plus petite du departement
	 */
	private static Ville getPlusPetiteVille(String code, ArrayList<Ville> villes) {
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		Ville min = iterator.next();
		while (iterator.hasNext()) {
			ville = iterator.next();
			if (ville.getPopulationTotale() < min.getPopulationTotale())
				min = ville;
		}
		return min;
	}

	/**
	 * dixPlusGrandesVilles : affiche les dix plus grandes villes du departement
	 * 
	 * @param code
	 * @param villes
	 */
	private static void dixPlusGrandesVilles(String code, ArrayList<Ville> villes) {
		Collections.sort(villes, Collections.reverseOrder());
		Iterator<Ville> iterator = villes.iterator();
		Ville ville = null;
		int compteur = 0;
		System.out.println("-------Les dix plus grandes villes du " + code + " : ---------");
		while (iterator.hasNext() && compteur < 10) {
			ville = iterator.next();
			if (ville.getCodeDepartement().equals(code)) {
				System.out.println(ville);
				compteur++;
			}
		}
	}

	/**
	 * dixPlusGrandesVillesRegion : affiche les dix plus grandes villes de la region
	 * 
	 * @param nom    : nom de la region
	 * @param villes
	 */
	private static void dixPlusGrandesVillesRegion(String nom, ArrayList<Ville> villes) {
		Collections.sort(villes, Collections.reverseOrder());
		Iterator<Ville> iterator = villes.iterator();
		Ville ville = null;
		int compteur = 0;
		System.out.println("-------Les dix plus grandes villes de " + nom + " : ---------");
		while (iterator.hasNext() && compteur < 10) {
			ville = iterator.next();
			if (ville.getNomRegion().equals(nom)) {
				System.out.println(ville);
				compteur++;
			}
		}
	}

	/**
	 * dixPlusPetitesVilles : affiche les dix plus petites villes du departement
	 * 
	 * @param code
	 * @param villes
	 */
	private static void dixPlusPetitesVilles(String code, ArrayList<Ville> villes) {
		Collections.sort(villes);
		Iterator<Ville> iterator = villes.iterator();
		Ville ville = null;
		int compteur = 0;
		System.out.println("-------Les dix plus petites villes du " + code + " : ---------");
		while (iterator.hasNext() && compteur < 10) {
			ville = iterator.next();
			if (ville.getCodeDepartement().equals(code)) {
				System.out.println(ville);
				compteur++;
			}
		}
	}

	/**
	 * departementPlusImportantRegion : le departement le plus important de la
	 * region
	 * 
	 * @param region
	 * @param villes
	 */
	private static void departementPlusImportantRegion(String region, ArrayList<Ville> villes) {
		// on parcours villes et on place les departements de la region dans une liste
		HashSet<String> departements = new HashSet<>();
		Iterator<Ville> iterator = villes.iterator();
		Ville ville = null;
		while (iterator.hasNext()) {
			ville = iterator.next();
			if (ville.getNomRegion().equals(region))
				departements.add(ville.getCodeDepartement());
		}

		// on cree une map avec les departements de la region et on l'initie a 0
		Map<String, Integer> map = new TreeMap<>();
		Iterator<String> iterator2 = departements.iterator();
		while (iterator2.hasNext())
			map.put(iterator2.next(), 0);

		// on parcourt villes et on affecte la population correspondant au departement
		iterator2 = departements.iterator();
		String departement;
		while (iterator2.hasNext()) {
			departement = iterator2.next();
			iterator = villes.iterator();
			while (iterator.hasNext()) {
				ville = iterator.next();
				if (ville.getCodeDepartement().equals(departement))
					map.put(departement, map.get(departement) + ville.getPopulationTotale());
			}
		}

		// on recupere le departement avec la plus grande population
		Iterator<String> keysIte = map.keySet().iterator();
		Iterator<Integer> valuesIte = map.values().iterator();
		String departementMax = keysIte.next();
		int valueMax = valuesIte.next();
		int value;
		while (keysIte.hasNext()) {
			departement = keysIte.next();
			value = valuesIte.next();
			if (value > valueMax) {
				departementMax = departement;
				valueMax = value;
			}
		}

		// on affiche le resultat
		System.out.println("Le departement " + departementMax + " est le plus peuple de la region " + region
				+ " avec une population de " + valueMax);

	}

	/**
	 * dixRegionsPlusPeuples : affiche les dix regions les plus peuples et leur
	 * population
	 * 
	 * @param villes
	 */
	public static void dixRegionsPlusPeuples(ArrayList<Ville> villes) {
		// on cree une liste avec les regions et on la met a jour avec la population des villes parcourues
		ArrayList<Region> regions = new ArrayList<>();
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		while (iterator.hasNext()) {
			ville=iterator.next();
			if (!containsRegion(ville.getNomRegion(),regions)) 
				regions.add(new Region(ville.getNomRegion(),ville.getPopulationTotale()));
			else
				regions = updateRegions(ville.getNomRegion(),ville.getPopulationTotale(),regions);
		}
		
		//on trie et on affiche les 10 regions les plus peuplees
		System.out.println("------Les 10 regions les plus peuplees-----");
		Collections.sort(regions, Collections.reverseOrder());
		Iterator<Region> iterator2 = regions.iterator();
		int compteur=0;
		while (iterator2.hasNext() && compteur<10) {
			System.out.println(iterator2.next());
			compteur++;
		}
	}
	
	/**
	 * containsRegion
	 * @param region
	 * @param regions
	 * @return true si regions contient une region avec region comme nom
	 */
	public static boolean containsRegion (String region, ArrayList<Region> regions) {
		Iterator<Region> iterator = regions.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getNom().equals(region))
				return true;
		}
		return false;
	}
	
	/**
	 * updateRegions
	 * @param nom
	 * @param population
	 * @param regions
	 * @return la liste des regions mise a jour avec sa population
	 */
	public static ArrayList<Region> updateRegions(String nom,int population,ArrayList<Region> regions){
		Iterator<Region> iterator = regions.iterator();
		Region region;
		while (iterator.hasNext()) {
			region=iterator.next();
			if (region.getNom().equals(nom))
				region.setPopulation(region.getPopulation()+population);
		}
		return regions;
	}

	/**
	 * dixDepartmtsPlusPeuples : affiche les dix regions les plus peuples et leur
	 * population
	 * 
	 * @param villes
	 */
	public static void dixDepartmtsPlusPeuples(ArrayList<Ville> villes) {
		// on cree une liste avec les departements et on la met a jour avec la population des villes parcourues
		ArrayList<Departement> departmts = new ArrayList<>();
		Iterator<Ville> iterator = villes.iterator();
		Ville ville;
		while (iterator.hasNext()) {
			ville=iterator.next();
			if (!containsDepartmt(ville.getCodeDepartement(),departmts)) 
				departmts.add(new Departement(ville.getCodeDepartement(),ville.getPopulationTotale()));
			else
				departmts = updateDepartmts(ville.getCodeDepartement(),ville.getPopulationTotale(),departmts);
		}
		
		//on trie et on affiche les 10 regions les plus peuplees
		System.out.println("------Les 10 departements les plus peuplees-----");
		Collections.sort(departmts, Collections.reverseOrder());
		Iterator<Departement> iterator2 = departmts.iterator();
		int compteur=0;
		while (iterator2.hasNext() && compteur<10) {
			System.out.println(iterator2.next());
			compteur++;
		}
	}
	
	/**
	 * containsDepartmt
	 * @param departmt
	 * @param departmts
	 * @return true si departmts contient un departmt avec departmt comme nom
	 */
	public static boolean containsDepartmt (String departmt, ArrayList<Departement> departmts) {
		Iterator<Departement> iterator = departmts.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCode().equals(departmt))
				return true;
		}
		return false;
	}
	
	/**
	 * updateDepartmts
	 * @param nom
	 * @param population
	 * @param departmts
	 * @return la liste des departements mise a jour avec sa population
	 */
	public static ArrayList<Departement> updateDepartmts(String code,int population,ArrayList<Departement> departmts){
		Iterator<Departement> iterator = departmts.iterator();
		Departement departmt;
		while (iterator.hasNext()) {
			departmt=iterator.next();
			if (departmt.getCode().equals(code))
				departmt.setPopulation(departmt.getPopulation()+population);
		}
		return departmts;
	}
	
	/**
	 * dixPlusGrandesVilles : affiche les dix plus grandes villes
	 * 
	 * @param code
	 * @param villes
	 */
	private static void dixPlusGrandesVilles(ArrayList<Ville> villes) {
		Collections.sort(villes, Collections.reverseOrder());
		Iterator<Ville> iterator = villes.iterator();
		Ville ville = null;
		int compteur = 0;
		System.out.println("-------Les dix plus grandes villes---------");
		while (iterator.hasNext() && compteur < 10) {
			ville = iterator.next();
			System.out.println(ville);
			compteur++;
		}
	}
}
