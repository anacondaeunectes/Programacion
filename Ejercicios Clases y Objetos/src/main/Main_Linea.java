package main;

import ejercicio7.*;

public class Main_Linea {

	public static void main(String[] args) {
		Punto p1=new Punto (3,4);
		Punto p2=new Punto (5,-1);
		System.out.println(p1.getX1()+" y "+p1.getY1());
		p1.setX1(4);
		p1.setY1(3);
		System.out.println(p1.getX1()+" y "+p1.getY1());
		
		Linea l1=new Linea(1,2,3,4);
		l1.getPosicion();
	}

}

