package prueba;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, cont, multiplo;
		cont = 1;
		
		do {
			System.out.println("Introduzca un n�mero:");
			num = teclado.nextInt();
		if (num <= 0) {
			System.out.println("N�mero no v�lido. Ha de ser mayor que 0.");
		}
		
		}while (num <= 0);
		
		multiplo = 3*cont;
		
		if (multiplo < num){
			System.out.println("Los m�ltiplos de 3 entre 1 y "+num+" son:");
			while (3*cont <= num){
				multiplo = 3*cont;
				System.out.println(multiplo);
				cont++;
			}
			System.out.println("En total, hay "+(cont-1)+" m�ltiplos de 3.");
		}else {
			System.out.println("No hay ning�n m�ltiplo de 3 entre el 1 y el "+num);
		}
				
		teclado.close();	
	}

}
