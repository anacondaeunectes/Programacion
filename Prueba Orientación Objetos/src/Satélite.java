
public class Satélite {
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	Satélite(){
		meridiano=0;
		paralelo=0;
		distancia_tierra=0;
	}
	
	Satélite(double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	//Satélite s1= new Satélite();
	//Satélite s2= new Satélite (3, 4, 8);
	
	public void setPosicion(double m, double p, double d) {
		meridiano= m;
		paralelo= p;
		distancia_tierra= d;	
	}
	public void printPosicion() {
		System.out.println("La distancia a la tierra: "+distancia_tierra);
		System.out.println("Dato meridiano: "+meridiano);
		System.out.println("Dato paralelo: "+paralelo);
	}
}

