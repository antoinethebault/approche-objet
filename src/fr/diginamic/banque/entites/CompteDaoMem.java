package fr.diginamic.banque.entites;

/**
 * @author antoinethebault
 *
 */
public class CompteDaoMem implements CompteDao{
	Compte[] comptes;

	@Override
	public Compte[] lister() {
		return comptes;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		Compte[] tmp;
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
		comptes=tmp;
		System.out.println("Creation d'un nouveau compte : "+comptes[comptes.length-1]);
	}

	@Override
	public boolean supprimer(String numero) {
		Compte[] tmp = new Compte[comptes.length-1];
		boolean supprimer=false;
		if (!existe(numero))
			return false;
		else if (comptes.length==1 && comptes[0].getNumero().equals(numero))
			tmp=null;
		else {
			System.out.println("Suppression du compte");
			for (int i=0;i<comptes.length-1;i++) {
				if (supprimer==false && !comptes[i].getNumero().equals(numero))
					tmp[i]=comptes[i];
				else if (supprimer==false && comptes[i].getNumero().equals(numero)) {
					supprimer=true;
					tmp[i]=comptes[i+1];
				}
				else if (supprimer==true)
					tmp[i]=comptes[i+1];
			}
		}
		comptes=tmp;
		return supprimer;
	}

	@Override
	public boolean existe(String numero) {
		for (int i=0;i<comptes.length;i++) {
			if (comptes[i].getNumero().equals(numero))
				return true;
		}
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		for (int i=0;i<comptes.length;i++) {
			if (comptes[i].getNumero().equals(numero))
				return comptes[i];
		}
		return null;
	}
	
}
