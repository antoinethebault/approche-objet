package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operations;

/**
 * @author antoinethebault
 * test de la gestion des operations de debit et de credit
 */
public class TestOperation {

	/**classe executable
	 * @param args 
	 */
	public static void main(String[] args) {
		/**operations declaration et affectation de la variable contenant 4 operations de
		 * debits et credits*/
		Operations[] operations = new Operations[4];
		operations[0]=new Debit("01/01/20", 10);
		operations[1]=new Debit("02/01/20", 15);
		operations[2]=new Credit("03/01/20", 20);
		operations[3]=new Credit("04/01/20", 25);
		/**declaration du montant global*/
		double montantGlobal=0;
		
		/**affichage des dates et montants des operations du tableau operations*/
		for (int i=0;i<operations.length;i++) {
			System.out.println(operations[i].afficherType()+" : "+operations[i].getDate()+" "+operations[i].getMontant()+"€");
			if (operations[i].afficherType()=="Debit")
				montantGlobal-=operations[i].getMontant();
			else if (operations[i].afficherType()=="Credit")
				montantGlobal+=operations[i].getMontant();
		}
		
		/**affichage du solde global*/
		System.out.println("Solde global : "+montantGlobal);
	}

}
