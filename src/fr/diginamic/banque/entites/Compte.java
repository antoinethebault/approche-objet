package fr.diginamic.banque.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author antoinethebault
 * classe de compte avec un numero de compte et un solde en attributs
 * et un constructeur permettant de creer une instance
 */
public class Compte {
	/**
	 * numero 	numero de compte
	 * solde 	solde du compte
	 * operations operations effectuees sur le compte
	 */
	private String numero;
	private double soldeInitial;
	 List<Operation> operations = new ArrayList<Operation>();
	
	/**
	 * @param numeroCompte	numero du compte
	 * @param soldeCompte	solde du compte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.setSolde(solde);
	}
	
	/**
	 *redefinition de la methode toString afin d'afficher le numero de compte et le solde
	 */
	@Override
	public String toString () {
		return "Numero de compte : "+numero+" - Solde : "+getSolde()+" - Nombre d'operations : "+ operations.size();
	}

	/** Getter
	 * @return solde : retourne le solde en fonction du solde initial et des operations
	 */
	public double getSolde() {
		ListIterator<Operation> it = operations.listIterator();
		double solde=soldeInitial;
	    while(it.hasNext()){
	    	Operation ope=it.next();
	    	if (ope.afficherType()=="Debit")
	    		solde-=ope.getMontant();
	    	else if (ope.afficherType()=="Credit")
	    		solde+=ope.getMontant();
	    }
		return solde;
	}
	
	/**
	 * @param type : le type des operations
	 * @return solde : le solde des operations de type type
	 */
	public double getSolde(String type) {
		double solde=0;
		ListIterator<Operation> it = operations.listIterator();
		if (type=="CREDIT") {
			while(it.hasNext()){
				Operation ope=it.next();
				if (ope.afficherType()=="Credit")
		    		solde+=ope.getMontant();
			}
		}
		else if (type=="DEBIT") {
			while(it.hasNext()){
				Operation ope=it.next();
				if (ope.afficherType()=="Debit")
		    		solde+=ope.getMontant();
			}
		}
		return solde;
	}

	/** Setter
	 * @param solde : affecte le solde
	 */
	public void setSolde(double solde) {
		this.soldeInitial = solde;
	}

	
	
	/**Getter
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**Setter
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/** ajoute une operation a la liste des operations
	 * @param ope
	 */
	public void ajouterOperation(Operation ope) {
		operations.add(ope);
	}
	
	/**
	 * getNbOperations 
	 * @return le nombre d'operations en cours
	 */
	public int getNbOperations() {
		return operations.size();
	}
	

}
