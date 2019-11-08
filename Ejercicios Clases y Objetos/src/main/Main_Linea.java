package main;

import ejercicio7.*;

public class Main_Linea {

	public static void main(String[] args) {
		/*podr�a ponerlos como double cambiando lo necesario en las dos clases para ahorrarme el (float) aunque el tipo float consume menos memoria. 
		Este es necesario por que Java asigna por defecto como Double los n�meros con comas flotantes.*/
		Punto p1=new Punto((float)1.0,(float)0.0);
		Punto p2=new Punto((float)0.0,(float)1.0);
		p1.setX(4);
		Linea l1=new Linea(p1,p2);
		
		
		
		
		System.out.println(l1.getPosicion());
		
		l1.mueveDerecha(1);
		System.out.println(l1.getPosicion());
		
		l1.mueveIzquierda(2);
		System.out.println(l1.getPosicion());
		
		l1.mueveArriba(1);
		System.out.println(l1.getPosicion());
		
		l1.mueveAbajo(1);
		System.out.println(l1.getPosicion());
	}

}

