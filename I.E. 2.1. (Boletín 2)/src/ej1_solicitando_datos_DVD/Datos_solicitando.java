package ej1_solicitando_datos_DVD;

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
	/*
	 * 	NO TIENE SENTIDO ESTE COSNTRUCTOR SI LE PIDO LOS DATOS AL USUARIO
	 * public Datos_solicitando(String resumen, String titulo, String genero, String director, int duracion) {
		this.resumen = resumen;
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.duracion = duracion;
	}*/

	Scanner teclado = new Scanner(System.in);
	public void setResumen() {
		System.out.println("Introduzca el resumen de la pelicula: ");
		this.resumen = teclado.nextLine();
	}
	public void setTitulo() {
		System.out.println("Introduzca el titulo de la pelicula: ");
		this.titulo = teclado.nextLine();
	}
	public void setDirector() {
		System.out.println("Introduzca el director  de la pelicula: ");
		this.director = teclado.nextLine();
	}
	public void setActores() {
		System.out.println("Introduzca los principales actores que aparecen en la pelicula: ");
		this.actores = teclado.nextLine();
	}
	public void setGenero() {
		System.out.println("Introduzca el genero de la pelicula: ");
		this.genero = teclado.nextLine();
	}
	public void setDuracion() {
		System.out.println("Introduzca la duracion  de la pelicula: ");
		this.duracion = teclado.nextInt();
	}
	public String muestraDVDCine() {
		return titulo+" De: "+director+"\nCon: "+actores+"\n"+genero+"-"+duracion+" min.\nResumen: "+resumen;
	}
	public String esThriller() {
		if (genero.equals("Thriller") || (genero.equals("thriller"))) {
			return "Si, es un thriller.";
		}else {
			return "No, no es un thriller.";
		}
	}
	public String tieneResumen() { 
		if (resumen.isEmpty()) {
			return "No, no tiene resumen.";
		}else {
			return "Si, tiene resumen.";
		}
	}
	public String muestraDuracion() {
		return "La duracion es de "+duracion+" min.";
	}
	
}
