package fr.diginamic.jdr;

import java.util.Scanner;

/**
 * @author antoinethebault Jeu class executable
 */
public class Jeu {

	/**
	 * main methode executable 
	 * choix : int correspond au choix du menu 
	 * 1 pour creer un personnage, 2 pour combattre une creature, 3 pour afficher le score, 4
	 * pour sortir
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int saisie=0;
		Personnage perso = new Personnage();
		Creature creature = null;
		Scanner sc = new Scanner(System.in);
		while (saisie != 4) {
			System.out.println("1. Creer un personnage");
			System.out.println("2. Combattre une creature");
			System.out.println("3. Afficher le score");
			System.out.println("4. Quitter");
			saisie = sc.nextInt();
			if (Integer.valueOf(saisie)==1)//on cree un nouveau personnage
				perso = new Personnage();
			else if (saisie==3)//on affiche le score
				System.out.println("Score : "+perso.getScore());
			else if (saisie==2) {//on initie un combat
				if (perso.getPointsDeVie()<=0)
					System.out.println("Votre personnage est décédé. Il a obtenu le score de "+perso.getScore()+" points. Veuillez créer un nouveau personnage");
				else {
					//on choisit aleatoirement la creature a combattre
					int typeCreature = 1 + (int)(Math.random() * ((3 - 1) + 1));
					if (typeCreature==1)
						creature = new Loup();
					else if (typeCreature==2)
						creature = new Gobelin();
					else if (typeCreature==3)
						creature = new Troll();
					System.out.println("Il faut combattre un "+creature.getType());
					//on boucle jusqu'a ce que soit le personnage soit la creature perd
					while (perso.getPointsDeVie()>=0 && creature.getPointsDeVie()>=0) {
						int attaquePerso = perso.getAttaque(), attaqueCreature=creature.getAttaque();
						if(attaquePerso>attaqueCreature)
							creature.soustraitPointsDeVie(attaquePerso-attaqueCreature);
						else if (attaqueCreature>attaquePerso)
							perso.soustraitPointsDeVie(attaqueCreature-attaquePerso);
					}
					//si le personnage a perdu, la partie est finie sinon il gagne au score le gain correspondant au type de creature
					if (perso.getPointsDeVie()<=0)
						System.out.println("Votre personnage est décédé. Il a obtenu le score de "+perso.getScore()+" points. Veuillez créer un nouveau personnage");
					else if (creature.getPointsDeVie()<=0) {
						perso.scoreAjout(creature.getGain());
						System.out.println("Votre personnage a gagne. Il a gagne "+creature.getGain()+" points, a le score de "+perso.getScore()+" et a "+perso.getPointsDeVie()+" points de vie.");
					}	
				}
			}
		}
		sc.close();

	}

}
