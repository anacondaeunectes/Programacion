package main;

import ejercicio1.Persona;

public class Main_Persona {

	public static void main(String[] args) {
		Persona p1=new Persona("Juan", "Borrego","33456678Z");
		
		//�Por qu� no puedo llamar directamente al nombre que ha aportado el constructor de la clase "Persona" a "p1" a trav�s de "p1.nombre"?
		System.out.println("El nombre es "+p1.getNombre());
		
	}
	
}
