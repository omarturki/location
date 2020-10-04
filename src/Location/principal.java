package Location;
import java.time.LocalDate;
import java.util.*;
public class principal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Garage g1= new Garage("garage1","tunis");
		Garage g2= new Garage("garage2","tunis");
		Client c1 = new Client(22345,"omar","turki","ariana");
		Vehicules v1 = new Vehicules(10645,"audi",0,60,"automatique","Q7",12,100, g1);
		Vehicules v2 = new Vehicules(10646,"audi",0,60,"automatique","Q7",12,100, g2);
		Vehicules v3 = new Vehicules(10647,"audi",0,60,"automatique","Q7",12,100, g2);
		Vehicules v4 = new Vehicules(10648,"audi",0,60,"automatique","Q7",12,100, g1);
		g1.add_vehicule(v1);
		g1.add_vehicule(v4);
		g2.add_vehicule(v3);
		g2.add_vehicule(v2);
		LocalDate d1=LocalDate.of(2020, 10, 1);
		LocalDate d2=LocalDate.of(2020, 10, 10);
		//System.out.println("la voiture situé a garage "+(g1.emprunt(v1)));
		g1.afficherlisteloue();
		g1.afficherlistedisponnible();
		g2.afficherlisteloue();
		g2.afficherlistedisponnible();
		Reservation r1 = new Reservation(v1,c1,g1);
		
	
		Facture f1 = new Facture(r1,d1, d2, new Date(), 100, 0.4);
		System.out.println((f1.montant(r1)));
		System.out.println("la voiture situé a garage "+(g1.restitution(v1)));

		g1.afficherlisteloue();
		g1.afficherlistedisponnible();
		g2.afficherlisteloue();
		g2.afficherlistedisponnible();
		//System.out.println(d12.isAfter(d13));
	}

}
