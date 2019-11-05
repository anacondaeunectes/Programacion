package prueba;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		String a= "*";
		String b= "*";
		byte cont;
		
		cont=1;
		
		do{
			System.out.println(a);
			a=a+b;
			cont++;
		}while (cont<=5);	

	}

}
