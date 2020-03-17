package fr.diginamic.banque;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.banque.entites.CompteDaoMem;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

/**
 * @author antoinethebault
 *TestCompteDao classe executable permettand de tester CompteDao et CompteDaoMem
 *situes dans entites
 */
public class TestCompteDao {

	static CompteDaoMem compteDaoMem = new CompteDaoMem();
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * main methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		int choix=0;
		while (choix!=99) {
			afficherMenu();
			choix=choix();
			switch (choix) {
			case 1:
				listerComptes();
				break;
			case 2:
				ajouterCompte();
				break;
			case 3:
				ajouterOperation();
				break;
			case 4:
				supprimerCompte();
				break;
			}	
		}
	}
	
	/**
	 * afficherMenu affiche le menu
	 */
	public static void afficherMenu() {
		System.out.println("***** Administration des comptes *****");
		System.out.println("1. Lister les comptes");
		System.out.println("2. Ajouter un nouveau compte");
		System.out.println("3. Ajouter une opération à un compte");
		System.out.println("4. Supprimer un compte");
		System.out.println("99. Sortir");
	}
	
	/**
	 * choix
	 * @return int : le choix effectue par rapport au menu
	 */
	public static int choix() {
		int choix = 0;
		choix = sc.nextInt();
		return choix;
	}

	/**
	 * listerComptes liste les comptes presents dans compteDaoMem
	 */
	public static void listerComptes() {
		List<Compte> comptes=compteDaoMem.lister();
		if (comptes!=null) {
			Iterator<Compte> iterator = comptes.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		else {
			System.out.println("Il n'y a pas de comptes");
		}
			
	}
	
	/**
	 * ajouterCompte ajoute un compte a compteDaoMem
	 */
	public static void ajouterCompte() {
		System.out.println("Veuillez saisir le numéro :");
		sc.nextLine();
		String numero = sc.nextLine();
		System.out.println("Veuillez saisir le solde initial :");
		double solde = sc.nextDouble();
		System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
		int type = sc.nextInt();
		if (type==1)
			compteDaoMem.sauvegarder(new Compte(numero, solde));
		else if (type==2) {
			System.out.println("Veuillez saisir le taux :");
			Double taux = sc.nextDouble();
			compteDaoMem.sauvegarder(new CompteTaux(numero, solde, taux));
		}
	}
	
	/**
	 * ajouterOperation ajouter une operation au compte choisi
	 */
	public static void ajouterOperation() {
		listerComptes();
		System.out.println("Veuillez choisir le numéro de compte concerné :");
		sc.nextLine();
		String numero = sc.nextLine();
		if (compteDaoMem.existe(numero)) {
			System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");
			int type = sc.nextInt();
			sc.nextLine();
			System.out.println("Veuillez saisir la date :");
			String date = sc.nextLine();
			System.out.println("Veuillez saisir le montant :");
			double montant = sc.nextInt();
			sc.nextLine();
			if (type==1) 
				compteDaoMem.getCompte(numero).ajouterOperation(new Credit(date,montant));
			else if (type==2)
				compteDaoMem.getCompte(numero).ajouterOperation(new Debit(date,montant));
		}
		else
			System.out.println("Le compte n'existe pas");
	}
	
	/**
	 * supprimerCompte supprimer le compte corespondant au numero demande dans compteDaoMem
	 */
	public static void supprimerCompte() {
		listerComptes();
		sc.nextLine();
		System.out.println("Veuillez saisir le numéro de compte à supprimer :");
		String numero=sc.nextLine();
		if (compteDaoMem.existe(numero)) {
			compteDaoMem.supprimer(numero);
		}
		else
			System.out.println("Le compte n'existe pas.");
	}
}
