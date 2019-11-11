package main;

import ejercicio1_solicitando_datos.Datos_solicitando;

public class main_Datos_solicitando {

	public static void main(String[] args) {
		Datos_solicitando d1=new Datos_solicitando();

		d1.setResumen();
		d1.setTitulo();
		d1.setDirector();
		d1.setActores();
		d1.setGenero();
		d1.setDuracion();
		
		System.out.println(d1.muestraDVDCine());
		System.out.println(d1.esThriller());
		System.out.println(d1.tieneResumen());
		System.out.println(d1.muestraDuracion());
	}

}
