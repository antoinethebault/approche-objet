package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author antoinethebault
 *calcul la moyenne
 */
public class CalculMoyenne {
	List<Double> list = new ArrayList<Double>();

	/**Constructor
	 * 
	 */
	public CalculMoyenne() {
		super();
	}
	
	/** gere l'ajout de nombres au tableau
	 * @param nb	nombre a ajouter
	 */
	public void ajout(Double nb) {
		list.add(nb);
	}
	
	/**calcul la somme des elements de la liste et divise par la taille de la liste
	 * @return la moyenne des elements de la liste
	 */
	public double calcul () {
		double somme=0;
		ListIterator<Double> it = list.listIterator();
		while(it.hasNext())
			somme+=it.next();
		return somme/list.size();
	}
	
}
