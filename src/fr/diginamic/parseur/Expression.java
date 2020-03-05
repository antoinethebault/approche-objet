package fr.diginamic.parseur;

/**
 * @author antoinethebault
 *Expression avec un membre gauche, un operateur et un membre droit
 *les membres peuvent etre des variables ou des constantes 
 */
public class Expression {
	private Membre membreGauche;
	private Membre membreDroit;
	private char operateur;

	/**Constructor
	 * @param membreGauche
	 * @param membreDroit
	 * @param operateur
	 */
	public Expression(Membre membreGauche, Membre membreDroit, char operateur) {
		super();
		this.membreGauche = membreGauche;
		this.membreDroit = membreDroit;
		this.operateur = operateur;
	}
	
	/**
	 * evaluer l'expression avec la valeur de la variable
	 * @param nomMembre nom de la variable
	 * @param valeurMembre valeur de la variable
	 * @return le resultat de l'expression avec les deux membres et l'operateur
	 */
	public double evaluer (String nomMembre, double valeurMembre) {
		
		//on affecte la valeur au nom correspondant
		if (membreGauche.getNom()!=null && membreGauche.getNom().equals(nomMembre)) {
			//System.out.println(true);
			membreGauche.setValue(valeurMembre);
		}
		else if (membreDroit.getNom()!=null && membreDroit.getNom().equals(nomMembre))
			membreDroit.setValue(valeurMembre);
		
		
		//System.out.println(membreGauche.getNom());
		//System.out.println(nomMembre+"="+valeurMembre);
		//System.out.println(membreGauche.getValue()+" "+operateur+" "+membreDroit.getValue());
		
		
		//on fait le calcul
		if (operateur=='+') 
			return membreGauche.getValue()+membreDroit.getValue();
		else if (operateur=='-') 
			return membreGauche.getValue()-membreDroit.getValue();
		else if (operateur=='*') 
			return membreGauche.getValue()*membreDroit.getValue();
		else if (operateur=='/') 
			return membreGauche.getValue()/membreDroit.getValue();
		
		return 0;
	}
}
