package main;

import ejercicio2.Vehiculo;

public class Main_Vehiculo {

	public static void main(String[] args) {

		Vehiculo v1=new Vehiculo("Seat Ibiza");
		v1.setPotencia(220.0);
		v1.setCReudas(false);
		
		System.out.println("El vehiculo es del modelo: "+v1.modelo);
		System.out.println("El vehiculo posee una potencia de "+v1.potencia+" W");
		if (v1.cRuedas==true) {
			System.out.println("El vehiculo posee traccion a las cuatro ruedas");
		}else if(v1.cRuedas==false) {
			System.out.println("El vehiculo no posee traccion a las cuatro ruedas");
		}
		
	}
	
}
