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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supprimer(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
