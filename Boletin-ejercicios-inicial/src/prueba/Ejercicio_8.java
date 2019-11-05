package prueba;

public class Ejercicio_8 {

	public static void main(String[] args) {
		
		int pares = 0, impares = 0, cont = 1;
		
		do {
			if (cont%2 == 0) {
				pares = pares + cont;
			}else {
				impares = impares + cont;
			}
			cont++;
		}while (cont <= 100);
		
		System.out.println("La suma de los números pares entre 1 y 100 es: "+pares);
		System.out.println("La suma de los números impares entre 1 y 100 es: "+impares);
	}

}
