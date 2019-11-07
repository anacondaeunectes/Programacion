package ejercicio7;

public class Linea {
	private Punto p1;
	private Punto p2;
	
	public Linea(Punto p1, Punto p2) {
		this.p1=new Punto(p1.getX(),p1.getY());
		this.p2=new Punto(p2.getX(),p2.getY());
	}

	/*
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
	*/

	public String getPosicion() {
		 return "[puntoA,puntoB]. Queda tal que: [("+p1.getX()+","+p1.getY()+"),("+p2.getX()+","+p2.getY()+")]";
	 }
	public void mueveDerecha(float dcha){
		p1.x=p1.x+dcha;
		p2.x=p2.x+dcha;
	}
	public void mueveIzquierda(float izq){
		p1.x=p1.x-izq;
		p2.x=p2.x-izq;
	}
	public void mueveArriba(float arriba) {
		p1.y=p1.y+arriba;
		p2.y=p2.y+arriba;
	}
	public void mueveAbajo(float abajo) {
		p1.y=p1.y-abajo;
		p2.y=p2.y-abajo;
	}
}

