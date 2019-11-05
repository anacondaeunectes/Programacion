package prueba;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 	
		
		float Prog,FOL,BBD,Marc,Sist,Ent;
		int nota;
		
		System.out.println("Introduzca su nota en Programación: ");
		Prog= teclado.nextFloat();
		System.out.println("Introduzca su nota en FOL: ");
		FOL= teclado.nextFloat();
		System.out.println("Itroduzca su nota en Base de Datos: ");
		BBD= teclado.nextFloat();
		System.out.println("Introdzca su nota en Lenguaje de Marcas: ");
		Marc= teclado.nextFloat();
		System.out.println("Introduzca su nota en Sistemas Informáticos: ");
		Sist= teclado.nextFloat();
		System.out.println("Introduzca su nota en Entorno de Desarrollo: ");
		Ent= teclado.nextFloat();
		
		System.out.println("Su nota media es: "+(Prog+FOL+BBD+Marc+Sist+Ent)/6);
		
	}
}