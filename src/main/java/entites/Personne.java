package entites;

public class Personne {
	// declaration des attributs
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	// declaration du constructeur
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// affichage du nom en majuscules et du prenom
	public void displayNomPrenom() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}

	// modifie le nom
	public void setNom(String nom) {
		this.nom = nom;
	}

	// modifie le prenom
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// modifie l'adresse
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	//renvoie le nom
	public String getNom() {
		return this.nom;
	}
	
	//renvoie le prenom
	public String getPrenom() {
		return this.prenom;
	}
	
	//renvoie l'adresse
	public AdressePostale getAdresse() {
		return this.adresse;
	}

}
