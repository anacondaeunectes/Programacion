package ej4_Cafetera;

public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;
	
	public Cafetera() {
		capacidadMaxima = 1000;
		capacidadActual = 0;
	}
	public Cafetera(int max) {
		capacidadMaxima = capacidadActual = max;
	}
	public Cafetera(int max, int actual) {
		this.capacidadMaxima = max;
		this.capacidadActual = actual;
		if (actual>max) {
			this.capacidadActual = this.capacidadMaxima;
		}
	}
	public int getMaximo() {
		return capacidadMaxima;
	}
	public void setMaximo(int nuevoMax) {
		this.capacidadMaxima = nuevoMax;
	}
	public int getActual() {
		return capacidadActual;
	}
	public void	 setActual(int	 nuevoActual) {
		this.capacidadMaxima = nuevoActual;
	}
	public void llenarCafetera() {
		this.capacidadActual = this.capacidadMaxima;
	}
	public void servirTaza(int cantidadServida) {
		if(cantidadServida>this.capacidadActual) {
			this.capacidadActual = this.capacidadActual - this.capacidadActual;
		}else {
			this.capacidadActual = this.capacidadActual - cantidadServida;
		}
	}
	public void vaciarCafetera() {
		this.capacidadActual = 0;
	}
	public void agregarCafe(int cantidadAgregada) {
		if (cantidadAgregada + this.capacidadActual > this.capacidadMaxima) {
			this.capacidadActual = this.capacidadMaxima;
		}else {
			this.capacidadActual = this.capacidadActual + cantidadAgregada;
		}
	}
}
