package ejercicio4;

public class Cafetera {
	private double capacidadMaxima;
	private double capacidadActual;
	
	public Cafetera() {
		capacidadMaxima=1000;
		capacidadActual=0;
	}
	public Cafetera(double max) {
		capacidadMaxima=capacidadActual=max;
	}
	public Cafetera(double max, double actual) {
		this.capacidadMaxima=max;
		this.capacidadActual=actual;
		if (actual>max) {
			this.capacidadActual=this.capacidadMaxima;
		}
	}
	public double getMaximo() {
		return capacidadMaxima;
	}
	public void setMaximo(double nuevoMax) {
		this.capacidadMaxima=nuevoMax;
	}
	public double getActual() {
		return capacidadActual;
	}
	public void	 setActual(double nuevoActual) {
		this.capacidadMaxima=nuevoActual;
	}
	public void llenarCafetera() {
		this.capacidadActual=this.capacidadMaxima;
	}
	public void servirTaza(double cantidadServida) {
		if(cantidadServida>this.capacidadActual) {
			this.capacidadActual=this.capacidadActual-this.capacidadActual;
		}else {
			this.capacidadActual=this.capacidadActual-cantidadServida;
		}
	}
}
