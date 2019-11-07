package main;

import ejercicio7.*;

public class Main_Linea {

	public static void main(String[] args) {
		Punto p1=new Punto(3,7);
		Punto p2=new Punto(1,5);
		Linea l1=new Linea(p1,p2);
		
		System.out.println(l1.getPosicion());
	}

}

