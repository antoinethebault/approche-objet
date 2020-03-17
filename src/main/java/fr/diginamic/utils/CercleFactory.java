package fr.diginamic.utils;

import entites.Cercle;

/**
 * @author antoinethebault
 * 
 */
public class CercleFactory {
	public static Cercle cercle (double rayon) {
		return new Cercle(rayon);
	}
}
