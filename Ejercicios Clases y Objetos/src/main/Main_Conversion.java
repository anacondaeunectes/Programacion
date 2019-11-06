package main;

import ejercicio4.Conversion;

public class Main_Conversion {

	public static void main(String[] args) {

		Conversion c1=new Conversion();
		
		System.out.println("Equivale a "+c1.millasAMetros(1)+" metros");
		System.out.println("Equivale a "+c1.millasAKilometros(1)+" Km");
	}

}
