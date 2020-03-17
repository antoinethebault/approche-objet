package fr.diginamic.formes;

/**
 * @author antoinethebault
 *Forme classe abstraite qui va representer la classe mere de diverses formes geometriques
 */
public abstract class Forme {
	/**
	 * calcul la surface de la forme
	 * @return
	 */
	public abstract double calculerSurface();
	
	/**
	 * calcul le perimetre de la forme
	 * @return
	 */
	public abstract double calculerPerimetre();
	
}
