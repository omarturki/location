package Location;
import java.util.*;

public class Garage  {
	private int idgarage;
	private String nomgarage;
	private String adress;
private static int compteur;
	private Set<Vehicules> voitureloue    ;
	private Set<Vehicules> voiturerest  ;
	//private Set<String> ter;
	public Garage() {
	}
	public Garage (String nom,String adress){
		this.idgarage=++compteur;
		this.adress=adress;
		this.nomgarage=nom;
		this.voitureloue=new HashSet<>();
		this.voiturerest=new HashSet<>();

		
	
	}
	public int getIdgarage() {
		return idgarage;
	}
	public void setIdgarage(int idgarage) {
		this.idgarage = idgarage;
	}
	public String getNomgarage() {
		return nomgarage;
	}
	public void setNomgarage(String nomgarage) {
		this.nomgarage = nomgarage;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void add_vehicule(Vehicules v) {
		if(v.getEtat()==0) {
			voiturerest.add(v);
		}
		else {
			voitureloue.add(v);

		}
	}
	public void del_vehicule_loue(Vehicules v) {
		if(this.emprunt(v)==true ) {
			voitureloue.remove(v);
			v.setEtat(0);
		}

	}
	public void del_vehicule_rest(Vehicules v) {
		if(this.restitution(v)==true ) {
			voiturerest.remove(v);
		}

	}
	public boolean emprunt (Vehicules v) {
		boolean b=false;
		if (voitureloue.contains(v)) {
			b=true;
		}
		return b;
	}
	public boolean restitution (Vehicules v) {
		boolean b=false;
		if (voiturerest.contains(v)) {
			b=true;
		}
		return b;
	}
	
	public void afficherlistedisponnible() {
		for(Vehicules v : this.voiturerest) {
			
			System.out.println(v);
		}
		
	}
	public void afficherlisteloue() {
		for(Vehicules v : this.voitureloue) {
			
			System.out.println(v);
		}
		
	}
	@Override
	public String toString() {
		return "Garage ["+ nomgarage + ", adress=" + adress + "]";
	}
}
