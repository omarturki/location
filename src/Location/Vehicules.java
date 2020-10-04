package Location;

public class Vehicules  {
	private int matricule;
	private String marque;
	private int etat;
	private Garage G;
	
	
	private int kilometrage;
	private String type;
	private String modele;
	private int  puissance;
	private double prix;

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Vehicules ( ) {
		
	}
	public Vehicules ( int matricule, String marque, int etat,int kilometrage,String type,String modele,int  puissance,double prix,Garage G) {
		this.etat=etat;
		this.kilometrage=kilometrage;
		this.marque=marque;
		this.matricule=matricule;
		this.puissance=puissance;
		this.type=type;
		this.modele=modele;
		this.prix=prix;
		this.G=G;

	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}


	public Garage getG() {
		return G;
	}

	public void setG(Garage g) {
		G = g;
	}

	@Override
	public String toString() {
		return "Vehicules [matricule=" + matricule + ", marque=" + marque + ", G=" + G + ", kilometrage=" + kilometrage
				+ ", type=" + type + ", modele=" + modele + ", puissance=" + puissance + ", prix=" + prix + "]";
	}


	


}
