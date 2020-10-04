package Location;
import java.time.LocalDate;
import java.util.*;

public class Facture extends Reservation {
	private int numero;
	private LocalDate datefacture;
	private LocalDate datelocation;
	private Date datefinlocation;
	private final double tva = 19.60;
	private int kilometrageretour;  
	private double forfait=0;
	private double remise;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getDatefacture() {
		return datefacture;
	}
	public void setDatefacture(LocalDate datefacture) {
		this.datefacture = datefacture;
	}
	public LocalDate getDatelocation() {
		return datelocation;
	}
	public void setDatelocation(LocalDate datelocation) {
		this.datelocation = datelocation;
	}
	public Date getDatefinlocation() {
		return datefinlocation;
	}
	public void setDatefinlocation(Date datefinlocation) {
		this.datefinlocation = datefinlocation;
	}
	
	public int getKilometrageretour() {
		return kilometrageretour;
	}
	public void setKilometrageretour(int kilometrageretour) {
		this.kilometrageretour = kilometrageretour;
	}
	public double getTva() {
		return tva;
	}
	
	public Facture(Reservation r1, LocalDate d1,LocalDate d2,Date datefinlocation,int kilometrageretour,double remise) {
		super(r1.getV(),r1.getC(),r1.getG1());
		this.numero++;
		this.datefacture=d1;
		this.datefinlocation=datefinlocation;
		this.datelocation=d2;
		this.kilometrageretour=kilometrageretour;
		this.remise=remise;
		
	}
	
	public int  distance(Reservation r) {
		return this.kilometrageretour-r.getV().getKilometrage();
		 
	}
	public double montant(Reservation r) {
		
		if(changergarage(r)==true) {
			forfait=0;
		}else {
			forfait=r.getV().getPuissance()*remise;
		}
		
		return (r.getV().getPrix()*distance(r))+((r.getV().getPrix()*distance(r))*tva/100)+forfait;
		
	}

	public double getRemise() {
		return remise;
	}
	
	public boolean changergarage(Reservation r) {
		boolean b=false;
		if(r.getG1().restitution(r.getV())==r.getV().getG().emprunt(r.getV())){
			r.getG1().del_vehicule_loue(r.getV());
			r.getV().setEtat(0);
			r.getG1().add_vehicule(r.getV());
			
			b= true;
		}else{
			r.getG1().del_vehicule_loue(r.getV());
			r.getV().setEtat(0);
			r.getG1().add_vehicule(r.getV());
			r.getV().setG(r.getG1());
			b= false;
		}
		return b;
	}
	
	public void setRemise(double remise) {
		if(this.getG1().emprunt(getV())==(this.getG1().restitution(getV()))) {
			this.remise = remise;
		}
		else {
			this.remise = 0;
		}
	}


	
	
	

}
