
public class Main {

	public static void main(String[] args) {

		Satélite s1= new Satélite();
		Satélite s2= new Satélite (3, 4, 8);
		
		s1.printPosicion();
		
		s2.setPosicion(30, 40, 80);
		s2.printPosicion();
	}

}
