package Location;

public class Reservation {
	private int id;
	private Client c;
	private Vehicules v;
	private Garage g1;

	public Client getC() {
		return c;
	}

	public void setC(Client c) {
		this.c = c;
	}

	public Vehicules getV() {
		return v;
	}

	public void setV(Vehicules v) {
		this.v = v;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Reservation (Vehicules v,Client c,Garage G1) {
		this.c=c;
		this.v=v;
		this.g1=G1;
	}
public void changerdispo(Garage G) {
	G.add_vehicule(getV());
}
	public Garage getG1() {
		return g1;
	}


	public void setG1(Garage g1) {
		this.g1 = g1;
	}

}
