package main;

import ej4_Cafetera.Cafetera;

public class Main_Cafetera {

	public static void main(String[] args) {
		Cafetera c1 = new Cafetera();
		c1.agregarCafe(1200);
		System.out.println(c1.getActual());
		c1.servirTaza(230);
		System.out.println(c1.getActual());
		c1.llenarCafetera();
		System.out.println(c1.getActual());
		
		Cafetera c2 = new Cafetera(500);
		System.out.println("\n" + c2.getActual());
		System.out.println(c2.getMaximo());
		c2.servirTaza(300);
		System.out.println(c2.getActual());
		c2.vaciarCafetera();
		System.out.println(c2.getActual());
		
		Cafetera c3 = new Cafetera(200,300);
		System.out.println("\n" + c3.getActual());
		System.out.println(c3.getMaximo());
	}

}
