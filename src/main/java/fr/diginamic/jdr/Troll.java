package fr.diginamic.jdr;

/**
 * @author antoinethebault
 *Troll heritant de la classe Creature
 */
public class Troll extends Creature {

	/**Constructor
	 * definit la force et le nombre de points de vie
	 */
	public Troll() {
		super();
		this.force = 10 + (int)(Math.random() * ((15 - 10) + 1));
		this.pointsDeVie = 20 + (int)(Math.random() * ((30 - 20) + 1));
	}

	@Override
	public String getType() {
		return "Troll";
	}

	@Override
	public int getGain() {
		return 5;
	}

}
