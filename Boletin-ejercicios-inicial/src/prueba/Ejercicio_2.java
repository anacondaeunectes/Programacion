package prueba;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, cifraUno, cifraDos, cifraTres, cifraCuatro;
		
		System.out.println("Introduzca un número con cuatro dígitos: ");
		
		do {
			num = teclado.nextInt();
			if (num<1000 | num>9999) {
				System.out.println("Por favor, introduzca un número válido(cuatro dígitos): ");
			}
		}while (num<1000 | num>9999);	
		
		cifraUno = num/1000;
		cifraDos = (num%1000)/100;
		cifraTres = (num%100)/10;
		cifraCuatro = num%10;
		
		System.out.println("El primer dígito es el: "+cifraUno);
		System.out.println("El segundo dígito es el: "+cifraDos);
		System.out.println("El tercer dígito es el: "+cifraTres);
		System.out.println("El cuarto dígito es el: "+cifraCuatro);
	
		teclado.close();
		
/*¡¡ANTES DE ENTREGAR->!! Si se ha dado el control de excepciones, y es aplicable, quitar
el IF inicial que controlaba que el número fuese de cuatro cifras*/
		
	}

}
