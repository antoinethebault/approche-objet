package fr.diginamic.jdr;

/**
 * @author antoinethebault
 *Loup heritant de la classe Creature
 */
public class Loup extends Creature {
	/**Constructor
	 * definit la force et le nombre de points de vie
	 */
	public Loup() {
		super();
		this.force = 3 + (int)(Math.random() * ((8 - 3) + 1));
		this.pointsDeVie = 5 + (int)(Math.random() * ((10 - 5) + 1));
	}

	@Override
	public String getType() {
		return "Loup";
	}

	@Override
	public int getGain() {
		return 1;
	}
}
