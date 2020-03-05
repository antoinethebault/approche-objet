package fr.diginamic.formes;

/**
 * @author antoinethebault
 * Rectangle : Classe heritant des methodes de Forme
 */
public class Rectangle extends Forme {

	/**largeur : Double*/
	/**longueur : Double*/
	Double largeur, longueur;
	
	/**Constructor
	 * @param largeur
	 * @param longueur
	 */
	public Rectangle(Double largeur, Double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		return largeur*longueur;
	}

	@Override
	public double calculerPerimetre() {
		return largeur*2+longueur*2;
	}

}
