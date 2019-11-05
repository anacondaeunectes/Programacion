
public class Satelite {	//en mayúscula la primera letra
	
	public double meridiano; //en minúsculas la primera. Es un dato ¿primitivo?
	private double paralelo;
	private double distancia_tierra;
	
	Satelite(){
		meridiano=0;
		paralelo=0;
		distancia_tierra=0;
	}
	
	Satelite(double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	//Satelite s1= new Satélite();
	//Satelite s2= new Satélite (3, 4, 8);
	
	public void setPosicion(double m, double p, double d) {	//CREO que no importa el orden de estos paremetros
		meridiano= m;
		paralelo= p;
		distancia_tierra= d;	
	}
	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	public void printPosicion() {
		System.out.println("La distancia a la tierra: "+distancia_tierra);
		System.out.println("Dato meridiano: "+meridiano);
		System.out.println("Dato paralelo: "+paralelo);
	}
}
