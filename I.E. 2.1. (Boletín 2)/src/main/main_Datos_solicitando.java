package main;

import ejercicio1_solicitando_datos.Datos;

public class main_Datos_solicitando {

	public static void main(String[] args) {
		Datos d1=new Datos();
		d1.setGenero();
		System.out.println(d1.esThriller());
		System.out.println(d1.muestraDVDCine());
	}

}
