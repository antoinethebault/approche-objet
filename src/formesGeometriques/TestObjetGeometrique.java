package formesGeometriques;

/**
 * @author antoinethebault
 *
 */
public class TestObjetGeometrique {

	/** classe executable
	 * @param args
	 */
	public static void main(String[] args) {
		/**declaration d'un tableau ObjetGeometrique de longueur 2*/
		ObjetGeometrique[] objetsGeometriques = new ObjetGeometrique[2];
		/**affectation d'objetsGeometriques avec un cercle et un rectangle*/
		objetsGeometriques[0]=new Cercle(5);
		objetsGeometriques[1]=new Rectangle(3,5);
		
		/**affichage des perimetres et surfaces des objets*/
		for (int i=0; i<objetsGeometriques.length; i++) {
			System.out.println("Perimetre : "+objetsGeometriques[i].perimetre());
			System.out.println("Surface : "+objetsGeometriques[i].surface());
		}
	}

}
