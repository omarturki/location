package Location;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class Payement_cheque extends Facture{
	private static Set<Facture> payement_cheque   ;
	public Payement_cheque(Reservation r,  LocalDate datefacture, LocalDate datelocation, Date datefinlocation,
			int kilometrageretour, int remise) {
		super(r, datefacture, datelocation, datefinlocation, kilometrageretour, remise);		
	}

	public Set<Facture> getFacture() {
		return payement_cheque;
	}

	public void setFacture( Facture f) {
		
		payement_cheque.add(f);
	}

	
}