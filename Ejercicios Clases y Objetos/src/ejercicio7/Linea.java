package ejercicio7;

public class Linea {
	private Punto PuntoA;
	private Punto PuntoB;
	
	public Linea(int x1, int y1, int x2, int y2) {
		PuntoA=new Punto(x1, y1);
		PuntoB=new Punto(x2, y2);
	} 
	 public String getPosicion() {
		 return "[puntoA,puntoB] -> [("+PuntoA.getX1()+","+PuntoA.getY1()+"),("+PuntoB.getX1()+","+PuntoB.getY1()+")";
	 }
}

