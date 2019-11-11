package ejercicio1_solicitando_datos;

import java.util.Scanner;

public class Datos_solicitando {
	private String resumen;
	private String titulo;
	private String director;
	private String actores;
	private String genero;
	private int duracion;
	
	public Datos_solicitando() {
	}
	public Datos_solicitando(String resumen, String titulo, String genero, String director, int duracion) {
		this.resumen=resumen;
		this.titulo=titulo;
		this.genero=genero;
		this.director=director;
		this.duracion=duracion;
	}

	
	public void setResumen() {
		System.out.println("Introduzca el resumen de la pel�cula: ");
		Scanner scannerResumen=new Scanner(System.in);
		this.resumen=scannerResumen.nextLine();
	}
	public void setTitulo() {
		System.out.println("Introduzca el t�tulo de la pel�cula: ");
		Scanner scannerTitulo=new Scanner(System.in);
		this.titulo=scannerTitulo.nextLine();
	}
	public void setDirector() {
		System.out.println("Introduzca el director  de la pel�cula: ");
		Scanner scannerDirector=new Scanner(System.in);
		this.director=scannerDirector.nextLine();
	}
	public void setActores() {
		System.out.println("Introduzca los principales actores que aparecen en la pel�cula: ");
		Scanner scannerActores=new Scanner(System.in);
		this.actores=scannerActores.nextLine();
	}
	public void setGenero() {
		System.out.println("Introduzca el g�nero de la pel�cula: ");
		Scanner scannerGenero=new Scanner(System.in);
		this.genero=scannerGenero.nextLine();
	}
	public void setDuracion() {
		System.out.println("Introduzca la duraci�n  de la pel�cula: ");
		Scanner scannerDuracion=new Scanner(System.in);
		this.duracion=scannerDuracion.nextInt();
	}
	public String muestraDVDCine() {
		return titulo+" De: "+director+"\nCon: "+actores+"\n"+genero+"-"+duracion+" min.\nResumen: "+resumen;
	}
	public String esThriller() {
		if (genero.equals("Thriller") || (genero.equals("thriller"))) {
			return "S�, es un thriller.";
		}else {
			return "No, no es un thriller.";
		}
	}
	public String tieneResumen() { 
		if (resumen.isEmpty()) {
			return "No, no tiene resumen.";
		}else {
			return "S�, tiene resumen.";
		}
	}
	public int muestraDuracion() {
		return duracion;
	}
	
}
