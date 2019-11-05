package prueba;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int menuVerdura, menuSemilla, cantidad, precio = 0;
		
		
		
		do {	
			System.out.println("Introduzca la verdura a la que corresponda la semilla:");
			System.out.println("1. Tomate.");
			System.out.println("2. Repollo.");
			System.out.println("3. Patata.");
			System.out.println("4. Cebolla.");
			
			menuVerdura = teclado.nextInt();
			if (menuVerdura < 1 | menuVerdura > 4){
				System.out.println("Opción no válida. Por favor, introduzca un valor acorde a una de las siguientes opciones:");
			}
		}while (menuVerdura < 1 | menuVerdura > 5);
			
			
		switch (menuVerdura){
			case 1:
				do {
					System.out.println("¿Qué tipo de semilla de tomate ha utilizado?");
					System.out.println("1. Pera");
					System.out.println("2. Ensalada");
					
					menuSemilla = teclado.nextInt();
					
					switch (menuSemilla) {
						case 1: precio = 15;break;
						case 2: precio = 20;break;
					}
					
					if (menuSemilla < 1 | menuSemilla > 2){
						System.out.println("Opción no válida. Por favor, introduzca un valor acorde a una de las siguientes opciones:");
					}
				}while(menuSemilla < 1 | menuSemilla > 2);	
			;break;
			
			case 2:
				precio = 10				
			;break;
						
			case 3:
				do {
					System.out.println("¿Qué tipo de semilla de patata ha utilizado?");
					System.out.println("1. Criolla");
					System.out.println("2. Pastusa");
					System.out.println("3. Salentuna");
					
					menuSemilla = teclado.nextInt();
					
					switch (menuSemilla) {
						case 1: precio = 8;break;
						case 2: precio = 9;break;
						case 3: precio = 11;break;
					}
				
					if (menuSemilla < 1 | menuSemilla > 2){
						System.out.println("Opción no válida. Por favor, introduzca un valor acorde a una de las siguientes opciones:");
					}
				}while (menuSemilla < 1 | menuSemilla > 3);	
			;break;
			
			case 4: 
				do {
					System.out.println("¿Qué tipo de semilla de cebolla ha utilizado?");
					System.out.println("1. Larga");
					System.out.println("2. Vieja");
					
					menuSemilla = teclado.nextInt();
					
					switch (menuSemilla) {
					case 1: precio = 15;break;
					case 2: precio = 13;break;
					}
					
					if (menuSemilla < 1 | menuSemilla > 2){
						System.out.println("Opción no válida. Por favor, introduzca un valor acorde a una de las siguientes opciones:");
					}
				}while(menuSemilla < 1 | menuSemilla > 2);	
			;break;
		}
		
	System.out.println("¿Cuántas semillas ha utilizado?");
	cantidad = teclado.nextInt();
	
	System.out.println("En total, el costo total es de "+cantidad*precio+".");
	
		
	teclado.close();
		
	}

}
