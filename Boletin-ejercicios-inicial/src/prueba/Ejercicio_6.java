package prueba;

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float nota;
		
		do {
			System.out.println("Por favor, introduzca su nota: ");
			nota = teclado.nextFloat();
			if (nota < 5) {
				System.out.println("Su nota es: Suspenso.");
			}else if (nota < 7){
				System.out.println("Su nota es: Bien.");
			}else if (nota < 9) {
				System.out.println("Su nota es: Notable.");
			}else {
				System.out.println("Su nota es: Sobresaliente.");
			}
			
		
			if (nota<0 | nota>10) {
			System.out.println("Valor no válido. Ha de introducir un valor entre 0 y 10. ");
			}
		}while (nota<0 | nota>10);
	
		teclado.close();
	}
}