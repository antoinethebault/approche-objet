package fr.diginamic.jdr;

/**
 * @author antoinethebault
 *Creature represente la classe mere d'un Loup, Gobelin ou Troll
 */
public abstract class Creature {
	/**force : int*/
	protected int force;
	/**pointsDeVie : int*/
	protected int pointsDeVie;
	
	/**
	 * getAttaque
	 * @return l'attaque definit par la force et un nombre aleatoire entre 1 et 10
	 */
	public int getAttaque() {
		return force+1+(int)(Math.random() * ((10 - 1) + 1));
	}
	
	/**
	 * attaque 
	 * @param attaque : soustrait les pointsDeVie
	 */
	public void soustraitPointsDeVie(int attaque) {
		pointsDeVie-=attaque;
	}
	
	/**
	 * getType
	 * @return le type de creature
	 */
	public abstract String getType();
	
	/**
	 * getGain
	 * @return le gain si la creature est battue
	 */
	public abstract int getGain();

	/**Getter
	 * @return the pointsDeVie
	 */
	public int getPointsDeVie() {
		return pointsDeVie;
	}
	
	
}
