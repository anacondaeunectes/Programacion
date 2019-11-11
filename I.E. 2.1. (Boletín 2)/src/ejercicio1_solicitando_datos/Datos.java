package ejercicio1_solicitando_datos;

import java.util.Scanner;

public class Datos {
	private String descripcion;
	private String resumen;
	private String titulo;
	private String director;
	private String actores;
	private String genero;
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
	public void setDescripcion() {
		System.out.println("Introduzca la descripción de la película: ");
		Scanner scannerDescripcion=new Scanner(System.in);
		this.descripcion=scannerDescripcion.next();
	}
	public void setResumen() {
		System.out.println("Introduzca el resumen de la película: ");
		Scanner scannerResumen=new Scanner(System.in);
		this.resumen=scannerResumen.next();
	}
	public void setTitulo() {
		System.out.println("Introduzca el título de la película: ");
		Scanner scannerTitulo=new Scanner(System.in);
		this.titulo=scannerTitulo.next();
	}
	public void setDirector() {
		System.out.println("Introduzca el director  de la película: ");
		Scanner scannerDirector=new Scanner(System.in);
		this.director=scannerDirector.next();
	}
	public void setActores() {
		System.out.println("Introduzca los principales actores que aparecen en la película: ");
		Scanner scannerActores=new Scanner(System.in);
		this.actores=scannerActores.next();
	}
	public void setGenero() {
		System.out.println("Introduzca el género de la película: ");
		Scanner scannerGenero=new Scanner(System.in);
		this.genero=scannerGenero.next();
	}
	public void setDuracion() {
		System.out.println("Introduzca la duración  de la película: ");
		Scanner scannerDuracion=new Scanner(System.in);
		this.duracion=scannerDuracion.nextInt();
	}
	public String muestraDVDCine() {
		return titulo+" De: "+director+"\n Con: "+actores+"\n";
	}
	public String esThriller() {
		if (genero.equals("Thriller") || (genero.equals("thriller"))) {
			return "Sí, es un thriller.";
		}else {
			return "No, no es un thriller.";
		}
	}
	public String tieneResumen() { //fermin
		if (resumen.equals("Thriller") || (genero.equals("thriller"))) {
			return "Sí, es un thriller.";
		}else {
			return "No, no es un thriller.";
		}
	}
	public String muestraDuracion() {
		return "duracion";
	}
	
	//public String tieneResumen() {
		
	//}
}
