package main;

import ejercicio4.Cafetera;

public class Main_Cafetera {

	public static void main(String[] args) {
		Cafetera c1=new Cafetera(100,30);
		c1.servirTaza(40);
		System.out.println(c1.getActual());
	}

}
