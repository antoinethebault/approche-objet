package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;	

/**
 * @author antoinethebault
 *Pays : classe contenant un nom, un nb d'habitants et un PIB/habitant
 */
public class Pays implements Comparable<Pays>{
	String nom;
	int nbHabitants;
	double pibParHabitant;
	/**Constructor
	 * @param nom
	 * @param nbHabitants
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitants, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}
	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}
	/**Getter
	 * @return the pibParHabitant
	 */
	public double getPibParHabitant() {
		return pibParHabitant;
	}
	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	/**Setter
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	public String toString() {
		return this.nom+" - PIB : "+this.pibParHabitant+"USD - Population : "+this.nbHabitants;
	}
	@Override
	public int compareTo(Pays o) {
		//return this.getNom().compareTo(o.getNom());
		if (this.getPibParHabitant()-o.getPibParHabitant()>0)
			return 1;
		else if (this.getPibParHabitant()-o.getPibParHabitant()<0)
			return -1;
		else
			return 0;
	}
	
	@Override
	public boolean equals(Object objet) {
		if (!(objet instanceof Pays))
			return false;
		
		Pays other = (Pays) objet;
		
		return new EqualsBuilder().append(nom, other.getNom()).isEquals();
					
	}
	
}
