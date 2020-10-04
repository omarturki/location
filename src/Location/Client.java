package Location;

public class Client {
    private int cin;
    private String nom;
	private String prenom;
	private String adress;
    public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Client() {
		
	}

	public Client(int cin,String nom,String prenom,String adress) {
		this.cin=cin;
		this.adress=adress;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	
}
