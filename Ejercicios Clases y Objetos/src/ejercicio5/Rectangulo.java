package ejercicio5;

public class Rectangulo {
	private Punto a, b, c, d;
	private double base, altura;
	
	//Constructores
	public Rectangulo(Punto a, Punto b, Punto c, Punto d) {
		this.a=new Punto(a.getX(),a.getY());
		this.b=new Punto(b.getX(),b.getY());
		this.c=new Punto(c.getX(),c.getY());
		this.d=new Punto(d.getX(),d.getY());
	}
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	//Métodos
	
	/*
	 *Este método haría la función de calcular  la superficie independientemente del construcotr que se haya usado para inicializar el resctángulo a través de 
	 *la estructura "if". Si la base es 0 significaría que se ha usado el constructor de los 4 puntos ya que no tiene sentido que la base sea 0.
	 *
	public double getSuperficie() { 
		if (base==0) {		
			base=a.getX()-b.getX();
			altura=a.getY()-c.getY();
		}
		return base*altura;
	}*/
	
	public void setBaseYAltura() {
		base=a.getX()-b.getX();
		altura=a.getY()-c.getY();	
	}
	public double getSuperficie() {
		return base*altura;
	}
}
