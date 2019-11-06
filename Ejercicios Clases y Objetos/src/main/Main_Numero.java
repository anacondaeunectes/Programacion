package main;

import ejercicio3.Numero;

public class Main_Numero {

	public static void main(String[] args) {
		Numero n1=new Numero();
		System.out.println(n1.getValor());
		
		n1.aniade(3);
		System.out.println(n1.getValor());
		
		n1.resta(1);
		System.out.println(n1.getValor());
		
		n1.getDoble();
		System.out.println(n1.getValor());
		
		n1.getDoble();
		System.out.println(n1.getValor());
		
		/*n1.getTriple();
		System.out.println(n1.getValor());*/
	}
	
}
