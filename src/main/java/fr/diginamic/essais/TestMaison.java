package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * @author antoinethebault
 *TestMaison : classe executable permettant de tester les classes du package fr.diginamic.maison
 */
public class TestMaison {

	/**main : methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0,0));
		maison.ajouterPiece(new Salon(25.0,0));
		maison.ajouterPiece(new SalleDeBain(10.0,0));
		maison.ajouterPiece(new WC(4.0,0));
		maison.ajouterPiece(new Chambre(20.0,1));
		maison.ajouterPiece(new Chambre(20.0,1));
		maison.ajouterPiece(new SalleDeBain(10.0,1));
		maison.ajouterPiece(new WC(4.0,1));
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Chambre(-20.0,1));
		maison.ajouterPiece(new Chambre(20.0,-1));
		System.out.println("Superficie du RDC : "+maison.getSuperficieEtage(0));
		System.out.println("Superficie de l'etage 1 : "+maison.getSuperficieEtage(1));
		System.out.println("Superficie totale : "+maison.getSuperficieTotale());
		System.out.println("Superficie totale des chambres : "+maison.getSuperficieType("Chambre"));
		System.out.println("Nombre des chambres : "+maison.getNombreType("Chambre"));
	}

}
