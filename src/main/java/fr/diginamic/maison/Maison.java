package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author antoinethebault
 *Maison implementant un certain nombre de pieces 
 *definit par Piece et ses classe filles: Cuisine, Chambre, SalleDeBain, Salon et WC
 */
public class Maison {
	/**pieces : List<Piece>*/
	private List<Piece> pieces = new ArrayList<Piece>();
	
	/**
	 * @param piece : piece a ajouter a la liste pieces
	 */
	public void ajouterPiece(Piece piece) {
		if (piece!=null && piece.etage>=0 && piece.superficie>0)
			pieces.add(piece);
	}
	
	/**
	 * @return la superficie totale de la maison apres avoir parcouru toutes les pieces de pieces
	 */
	public double getSuperficieTotale() {
		/**it : ListIterator<piece> permet de parcourir la liste des pieces dans pieces*/
		ListIterator<Piece> it = pieces.listIterator();
		/**somme: double contient la somme des superficies des pieces parcourues*/
		double somme=0;
	    while(it.hasNext()){
	    	somme+=it.next().getSuperficie();
	    }
		return somme;
	}
	
	/**
	 * @param etage
	 * @return la superficie totale des pieces parcourues a un etage donne
	 */
	public double getSuperficieEtage(int etage) {
		/**it : ListIterator<piece> permet de parcourir la liste des pieces dans pieces*/
		ListIterator<Piece> it = pieces.listIterator();
		/**somme: double contient la somme des superficies des pieces parcourues de l'etage donne*/
		double somme=0;
		/**piece : Piece correspondant a la piece parcourue*/
		Piece piece;
	    while(it.hasNext()){
	    	piece=it.next();
	    	if (piece.getEtage()==etage)
	    		somme+=piece.getSuperficie();
	    }
		return somme;
	}
	
	/**
	 * @param type : le type de piece : Chambre, Cuisine, SalleDeBain, Salon ou WC
	 * @return la superficie totale des pieces d'un type
	 */
	public double getSuperficieType(String type) {
		/**it : ListIterator<piece> permet de parcourir la liste des pieces dans pieces*/
		ListIterator<Piece> it = pieces.listIterator();
		/**somme: double contient la somme des superficies des pieces parcourues
		 * correspondant a un type specifique
		 * */
		double somme=0;
		/**piece : Piece correspondant a la piece parcourue*/
		Piece piece;
	    while(it.hasNext()){
	    	piece=it.next();
	    	if (piece.getType()==type)
	    		somme+=piece.getSuperficie();
	    }
		return somme;
	}
	
	/**
	 * @param type : le type de piece dont on doit recuperer le nombre de pieces
	 * @return le nombre de pieces correspondant au type
	 */
	public int getNombreType(String type) {
		/**it : ListIterator<piece> permet de parcourir la liste des pieces dans pieces*/
		ListIterator<Piece> it = pieces.listIterator();
		/**nb: double contient le nombre des pieces parcourues correspondant au type definit
		 * dans type*/
		int nb=0;
		/**piece : Piece correspondant a la piece parcourue*/
		Piece piece;
	    while(it.hasNext()){
	    	piece=it.next();
	    	if (piece.getType()==type)
	    		nb++;
	    }
		return nb;
	}
}
