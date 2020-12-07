package couplage;

public class Myapp {

	public static void main(String[] args) {
		BoiteImpl b1 =new BoiteImpl(4);
		BoiteImpl b2 =new BoiteImpl(5);
		MoteurImpl2 m1= new MoteurImpl2(b1,60);
		MoteurImpl2 m2= new MoteurImpl2(b2,80);
		VoitureImpl v1= new VoitureImpl("Peugeot 205", m1);
		VoitureImpl v2= new VoitureImpl("Golf 4", m2);
		 System.out.println("La voiture "+v1.getNom()+" possède une puissance de "+v1.getMoteur().getPuissances()+" chevaux et sa consommation est de "+v1.getMoteur().getConsommation()+"%.");
		 System.out.println("La voiture "+v2.getNom()+" possède une puissance de "+v2.getMoteur().getPuissances()+" chevaux et sa consommation est de "+v2.getMoteur().getConsommation()+"%.");
	}

}
