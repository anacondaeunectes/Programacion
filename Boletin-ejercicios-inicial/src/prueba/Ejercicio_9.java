package prueba;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		int  menu;
		float operacion = 0, primNum, segNum;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca dos números:");
		
		primNum = teclado.nextFloat();
		segNum = teclado.nextFloat();

		do {
			do {
				System.out.println("¿Qué quiere hacer?");
				System.out.println("1. Sumar los números.");
				System.out.println("2. Restar los números.");
				System.out.println("3. Multiplicar los números.");
				System.out.println("4. Dividir los números.");
				System.out.println("5. Salir del programa.");
				
				menu = teclado.nextInt();
				if (menu < 1 | menu > 5){
					System.out.println("Opción no válida. Por favor, introduzca un valor acorde a una de las siguientes acciones:");
				}
			}while (menu > 1 | menu < 5);
			
			switch (menu){
			case 1: operacion = primNum + segNum;break;
			case 2: operacion = primNum - segNum;break;
			case 3: operacion = primNum * segNum;break;
			case 4: operacion = primNum / segNum;break;
			case 5: System.exit(0);break;
			}
			
			if (menu != 5)
				System.out.println("El resultado es "+operacion);
		
		}while(menu != 5);
			
		teclado.close();
	}

}
