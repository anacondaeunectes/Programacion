package ejercicio7;

public class Linea {
	private Punto p1;
	private Punto p2;
	
	public Linea(Punto p1, Punto p2) {
		this.p1=new Punto(2,6);
		this.p2=new Punto(0,0);
	}
	
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public String getPosicion() {
		 return "Esto: "+p1.getX();
	 }
}

