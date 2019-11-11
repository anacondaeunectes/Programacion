package ejercicio1_solicitando_datos;

import java.util.Scanner;

public class Datos {
	private String descripcion;
	private String resumen;
	private String titulo;
	private String genero;
	private String director;
	private int duracion;
	
	public Datos() {
	}
	public Datos(String descripcion, String resumen, String titulo, String genero, String director, int duracion) {
		this.descripcion=descripcion;
		this.resumen=resumen;
		this.titulo=titulo;
		this.genero=genero;
		this.director=director;
		this.duracion=duracion;
	}
	public String muestraDVDCine() {
		System.out.println("Introduzca la descripción de la película: ");
		Scanner scannerDescripcion=new Scanner(System.in);
		this.descripcion=scannerDescripcion.next();
		return descripcion;
	}
	public String esThriller() {
		System.out.println("Introduzca el género de la película: ");
		Scanner scannerThriller=new Scanner(System.in);
		if (genero.equals("Thriller") || (genero.equals("thriller"))) {
			return "Cierto";
		}else {
			return "Falso";
		}
	}
}
