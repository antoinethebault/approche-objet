package fr.diginamic.jdr;

/**
 * @author antoinethebault
 *Gobelin heritant de la classe Creature
 */
public class Gobelin extends Creature{
	/**Constructor
	 * definit la force et le nombre de points de vie
	 */
	public Gobelin() {
		super();
		this.force = 5 + (int)(Math.random() * ((10 - 5) + 1));
		this.pointsDeVie = 10 + (int)(Math.random() * ((15 - 10) + 1));
	}

	@Override
	public String getType() {
		return "Gobelin";
	}

	@Override
	public int getGain() {
		return 2;
	}
}
