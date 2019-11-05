package prueba;


import java.util.Scanner;  

public class Ejercicio_billetes {
	  public static void main(String[] args) {
		 
		float Cantidad, Centimos;
		int Dinero;

		Scanner teclado = new Scanner(System.in);
	    System.out.println("Introduzca la cantidad: ");
	    Cantidad= teclado.nextFloat();
	    
	    Dinero=(int)Cantidad;	
	    /*El atributo "Dinero" va a transformar la cantidad, "Cantidad" que metamos en un entero para 
	    calcular los billetes y las monedas por si introducimos una cantidad con céntimos. Si es el
	    caso, la diferencia entre el valor introducido y el valor entero van a ser los céntimos restantes.*/
	    
	    
	    System.out.println("El número de billetes de 500€ es: "+Dinero/500);
	    Dinero=Dinero%500;
	    System.out.println("El número de billetes de 200€ es: "+Dinero/200);
	    Dinero=Dinero%200;
	    System.out.println("El número de billetes de 100€ es: "+Dinero/100);
	    Dinero=Dinero%100;
	    System.out.println("El número de billetes de 50€ es: "+Dinero/50);
	    Dinero=Dinero%50;
	    System.out.println("El número de billetes de 10€ es: "+Dinero/10);
	    Dinero=Dinero%10;
	    System.out.println("El número de billetes de 5€ es: "+Dinero/5);
	    Dinero=Dinero%5;
	    System.out.println("El número de monedas de 2€ es: "+Dinero/2);
	    Dinero=Dinero%2;
	    System.out.println("El número de monedas de 1€ es: "+Dinero/1);
	    Dinero=Dinero%1;
	    
	    Dinero=(int)Cantidad;
	    if (Cantidad>Dinero);
    	System.out.println("Además, sobran "+(Cantidad-Dinero)+" €");  	
	    /*Desconozco porque al correr el programa, los céntimos calculados en la operación "Cantidad-Dinero" 
	    no se correspende a un valor con solo 2 decimales. Si por ejemplo, introduzco el valor 1328,56 la 
	    operación quedaría tal que 1328,56-1328. Debería dar 0,56 pero da 0,5600586*/
	    
    	
	      
	  }
	}