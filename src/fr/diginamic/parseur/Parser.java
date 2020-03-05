package fr.diginamic.parseur;

/**
 * @author antoinethebault
 *Parser permet notamment de renvoyer une expression avec un membre gauche, un operateur et un membre droit
 *a partir de la chaine envoyee en parametre
 */
public class Parser {
	/**
	 * parse renvoie une expression avec un membre gauche, un operateur et un membre droit
	 *a partir de la chaine envoyee en parametre
	 * @param chaine de type x+5, 3-y...
	 * @return
	 */
	public static Expression parse(String chaine) {
		Membre membreGauche = null;
		Membre membreDroit = null;
		char operateur = 0;
		
		//detecte l'operateur present
		if (chaine.indexOf('+')>0)
			operateur = '+';
		else if (chaine.indexOf('-')>0)
			operateur = '-';
		else if (chaine.indexOf('*')>0)
			operateur = '*';
		else if (chaine.indexOf('/')>0)
			operateur = '/';
		
		//definit les membres de l'expression en fonction de l'emplacement de l'operateur
		if (isNumeric(chaine.substring(0, chaine.indexOf(operateur))))
			membreGauche = new Membre(Double.valueOf(chaine.substring(0, chaine.indexOf(operateur))));
		else 
			membreGauche = new Membre(chaine.substring(0, chaine.indexOf(operateur)));
		if (isNumeric(chaine.substring(chaine.indexOf(operateur)+1)))
			membreDroit = new Membre(Double.valueOf(chaine.substring(chaine.indexOf(operateur)+1)));
		else
			membreDroit = new Membre(chaine.substring(chaine.indexOf(operateur)+1));
		return new Expression(membreGauche, membreDroit, operateur);
			
	}
	
	/**
	/**
	 * isNumeric retourne true si la chaine est un nombre, faux sinon
	 * https://www.baeldung.com/java-check-string-number
	 * @param strNum
	 * @return
	 */
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
