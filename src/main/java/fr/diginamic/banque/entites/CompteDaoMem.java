package fr.diginamic.banque.entites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author antoinethebault
 *
 */
public class CompteDaoMem implements CompteDao{
	List<Compte> comptes;

	@Override
	public List<Compte> lister() {
		return comptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		/*Compte[] tmp;
		if (comptes==null) {
			tmp = new Compte[1];
			tmp[0]=nvCompte;
		}
		else {
			tmp = new Compte[comptes.length+1];
			for (int i=0;i<comptes.length;i++)
				tmp[i]=comptes[i];
			tmp[comptes.length]=nvCompte;
		}
		comptes=tmp;*/
		if (comptes==null)
			comptes=new ArrayList<>();
		comptes.add(nvCompte);
		System.out.println("Creation d'un nouveau compte : "+nvCompte);
	}

	@Override
	public boolean supprimer(String numero) {
		boolean supprimer=false;
		if (!existe(numero))
			return false;
		else {
			Iterator<Compte> iterator = comptes.iterator();
			while (iterator.hasNext()) {
				if (iterator.next().getNumero().equals(numero))
					iterator.remove();
			}
		}
		return supprimer;
	}

	@Override
	public boolean existe(String numero) {
		Iterator<Compte> iterator = comptes.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getNumero().equals(numero))
				return true;
		}
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		Iterator<Compte> iterator = comptes.iterator();
		Compte compte;
		while (iterator.hasNext()) {
			compte=iterator.next();
			if(compte.getNumero().equals(numero))
				return compte;
		}
		return null;
	}
	
}
