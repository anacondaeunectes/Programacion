package ejercicio7;

public class Linea {
	private Punto p1;
	private Punto p2;
	
	public Linea(Punto p1, Punto p2) {
		p1=new Punto(0,0);
		p2=new Punto(0,0);
	} 
	 public String getPosicion() {
		 return "[puntoA,puntoB] -> [("+p1.getX()+","+p1.getY()+"),("+p2.getX()+","+p2.getY()+")";
	 }
}

