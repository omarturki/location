package Location;

import java.time.LocalDate;
import java.util.*;

public class Payement_carte extends Facture{

	public Payement_carte(Reservation r,  LocalDate datefacture, LocalDate datelocation, Date datefinlocation,
			int kilometrageretour, int remise) {
		super(r, datefacture, datelocation, datefinlocation, kilometrageretour, remise);
		
	}

}
