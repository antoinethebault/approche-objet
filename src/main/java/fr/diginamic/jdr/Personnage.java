package fr.diginamic.jdr;

/**
 * @author antoinethebault
 *Personnage classe representant le personnage utilise pour jouer
 */
public class Personnage extends Creature{
	private int score=0;
	
	/**Constructor
	 * definit la force, les points de vie et le score
	 */
	public Personnage() {
		super();
		this.force = 12 + (int)(Math.random() * ((18 - 12) + 1));
		this.pointsDeVie = 20 + (int)(Math.random() * ((50 - 20) + 1));
		this.score=0;
	}

	@Override
	public String getType() {
		return "Personnage";
	}
	
	/**
	 * scoreAjout : definit le score du personnage en fonction du score a ajouter
	 * @param score
	 */
	public void scoreAjout (int score) {
		this.score+=score;
	}
	
	/**
	 * getScore
	 * @return le score actuel
	 */
	public int getScore() {
		return score;
	}

	@Override
	public int getGain() {
		return 0;
	}
	
}
