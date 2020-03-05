package fr.diginamic.formes;

/**
 * @author antoinethebault
 *Cercle : classe heritant des methodes de Forme
 */
public class Cercle extends Forme{
	private double rayon;
	
	/**Constructor
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	/**
	 * calculerSurface : calcul la surface du cercle
	 */
	@Override
	public double calculerSurface() {
		return Math.PI*rayon*rayon;
	}

	/**calculerPerimetre : calcul le perimetre du cercle*/
	@Override
	public double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}

}
