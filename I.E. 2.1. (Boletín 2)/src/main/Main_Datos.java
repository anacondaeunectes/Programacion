package main;

import ej1_DVD.Datos;

public class Main_Datos {

	public static void main(String[] args) {
		Datos d1=new Datos("UN FINAL MADE IN HOLLYWOOD (HOLLYWOOD ENDING) De: Woody\n" + 
				"Allen\n" + 
				"Con: Woody Allen y George Hamilton\n" + 
				"Comedia - 114 min.\n" + 
				"Resumen: Los Oscars ganados en el pasado por el ex-genio del cine ...", true, true, 114);
		
		System.out.println(d1.muestraDVDCine()+"\n");
		System.out.println(d1.esThriller()+"\n");
		System.out.println(d1.tieneResumen()+"\n");
		System.out.println(d1.muestraDuracion());
	}

}
