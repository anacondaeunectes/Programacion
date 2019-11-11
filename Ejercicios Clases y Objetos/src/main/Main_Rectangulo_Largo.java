package main;

import ejercicio5.Rectangulo;

public class Main_Rectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo(1, 1, 3, 1, 1, 4, 3, 4);
		
		System.out.println("La superficie del rectangulo 1 es "+r1.getSuperficie()+" metros cuadrados.");
		
		Rectangulo r2=new Rectangulo(5, 0, 0, 4, 5, 4);
		System.out.println("La superficie del rectangulo 2 es "+r2.getSuperficie()+" metros cuadrados.");
	}
	
	
}
