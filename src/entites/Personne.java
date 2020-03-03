package entites;

public class Personne {
	//declaration des attributs
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	//declaration du constructeur
	public Personne(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	//affichage du nom en majuscules et du prenom
	public String afficheNomPrenom () {
		return this.nom.toUpperCase()+" "+this.prenom;
	}
}
