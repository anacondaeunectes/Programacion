package prueba;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num, posit, negat, neutro, cont, contPosit;
		
		posit = 0;
		negat = 0;
		neutro = 0;
		cont = 0;
		contPosit = 0;
		
		do{
			num = teclado.nextInt();
			if (num==0){
				neutro = neutro++;
				
			}
			if (num>0) {
				posit = posit+num;
				contPosit++;
			}
			if (num<0) {
				negat=negat+num;
			}
			cont++;
		}while (cont <=10);
		
		System.out.println("La media de los números positivos introducidos es: "+posit/contPosit);
		System.out.println("La media de los números negativos introducidos es: "+negat/(10-contPosit-neutro));
		if (neutro==0) {
			System.out.println("Ha introducido "+neutro+" veces el número 0.");
		}else {
			System.out.println("No ha introducido el valor 0.");
		}
		teclado.close();
	}
	
}
