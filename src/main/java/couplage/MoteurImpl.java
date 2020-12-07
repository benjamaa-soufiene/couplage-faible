package couplage;

public class MoteurImpl implements Moteur{
	private Boite boite;
	private int puissances;

	public Boite getBoite() {
		return boite;
	}

	public void setBoite(Boite boite) {
		this.boite = boite;
	}

	public int getPuissances() {
		return puissances;
	}

	public void setPuissances(int puissances) {
		this.puissances = puissances;
	}

	public MoteurImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoteurImpl(Boite boite, int puissances) {
		super();
		this.boite = boite;
		this.puissances = puissances;
	}

	public int getConsommation() {
		return 4;
	}

}
