package prueba;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int diaSalida, diaLlegada, horaSalida, horaLlegada, minSalida, minLlegada, difDia = 0,  difHora = 0, difMin = 0, nuevaFecha, recurso = 0;
		String cambioMes;
		String cambioDiaLlegada;
		String afirmativo = "S";
		String afirmativo1 = "s";
		String negativo = "n";
		String negativo1 = "N";
		
		
		
		
		System.out.println("Introduzca el día de salida: ");
		diaSalida = teclado.nextInt();
		while (diaSalida < 0 | diaSalida > 31){		//Restricción rango de posibles días dentro de un mes(1-31).
			System.out.println("Fecha no válida. La fecha ha introducir ha de encontrarse entre 1 y 31. Por favor, introduzca el día de salida:");
			diaSalida = teclado.nextInt();
		}
		
		System.out.println("Introduzca el día de llegada: ");
		diaLlegada = teclado.nextInt();
		while (diaLlegada < 0 | diaLlegada > 31){	//Restricción rango de posibles días dentro de un mes(1-31).
			System.out.println("Fecha no válido. La fecha ha introducir ha de encontrarse entre 1 y 31. Por favor, introduzca el minuto de llegada:");
			diaLlegada = teclado.nextInt();
		}
		
		/*Restricción día llegada < día salida. Se pregunta si ha pasado de un mes a otro durante el viaje. En caso afirmativo, se tendrá en cuenta para el cálculo posterior en el apartado de "difDia".
	 	En caso negativo, se le repetira la pregunta de la fecha de salida y llegada. */
	 	
		difDia = diaLlegada - diaSalida;
		
		while (diaLlegada < diaSalida && recurso == 0){
			System.out.println("El día de llegada introducido es menor que el día de salida. ¿Ha cambiado de mes durante el trascurso de su viaje?(S/n)");
			cambioMes = teclado.next();
			if (cambioMes.equals(afirmativo) | (cambioMes.contentEquals(afirmativo1)) ){
				System.out.println("Entendido. Por favor, continue.");
				difDia = (31-diaSalida) + diaLlegada;		//Habría que tener en cuenta si el mes es de 30 o de 31 días, pero voy a dejarlo en un estandar de 31. También habría que tener en cuenta si han pasado más de un mes durante el transcurso del viaje pero no lo voy a tener en cuenta
				recurso++;
			}else if (cambioMes.equals(negativo) | (cambioMes.contentEquals(negativo1))) {
				System.out.println("La fecha de llegada introducida es anterior a la de salida.Error.¿Quiere introducir de nuevo la fecha de llegada del viaje en tren?(S/n) ");
				cambioDiaLlegada = teclado.next();
				if (cambioDiaLlegada.equals(afirmativo) | (cambioDiaLlegada.contentEquals(afirmativo1)) ){
					System.out.println("Introduzca el día de llegada:");
					diaLlegada = teclado.nextInt();
					difDia = diaLlegada - diaSalida;	//Poner en su sitio
					
					while (diaLlegada < 1 | diaLlegada > 31){	//Restricción rango de posibles días dentro de un mes(1-31).
						System.out.println("Fecha no válida. La fecha ha introducir ha de encontrarse entre 1 y 31. Por favor, introduzca el día de llegada:");
						diaLlegada = teclado.nextInt();
					}
					
					//¡¡OJO!! Por que si el usuario vuelve a introducir una fecha de llegada menor que la de salida, se volverá a repetir el bucle.
					}else if(cambioDiaLlegada.equals(negativo) | (cambioDiaLlegada.contentEquals(negativo1))){
						System.out.println("Fallo lógico en los datos introducidos.");
						System.exit(0);
				}
			}
		}
		
		System.out.println("Introduzca la hora de salida(tan solo la hora): ");
		horaSalida = teclado.nextInt();
		while (horaSalida < 0 | horaSalida > 23){	//Restricción rango de posibles horas dentro de un día(1-23).
			System.out.println("Hora no válida. La hora ha de encontrarse entre las 1 y 23 horas. Por favor, introduzca la hora de salida:");
			horaSalida = teclado.nextInt();
		}
		
		System.out.println("Introduzca el minuto en el que se ha salido: ");
		minSalida = teclado.nextInt();
		while (minSalida < 0 | minSalida > 59){		//Restricción rango de posibles minutos dentro de una hora(1-59).
			System.out.println("Minuto no válido. El minuto de llegada ha de encontrarse entre 1 y 59. Por favor, introduzca el minuto de salida:");
			minSalida = teclado.nextInt();
		}

		
		System.out.println("Introduzca la hora de llegada (tan solo la hora): ");
		horaLlegada = teclado.nextInt();
		while (horaLlegada < 0 | horaLlegada > 23){	//Restricción rango de posibles horas dentro de un día(1-23).
			System.out.println("Hora no válida. La hora ha de encontrarse entre las 1 y 23 horas. Por favor, introduzca la hora de llegada:");
			horaLlegada = teclado.nextInt();
		}
	
		System.out.println("Introduzca el minuto en el que se ha llegado: ");
		minLlegada = teclado.nextInt();
		while (minLlegada < 0 | minLlegada > 59){	//Restricción rango de posibles minutos dentro de una hora(1-59).
			System.out.println("Minuto no válido. El minuto de llegada ha de encontrarse entre 1 y 59. Por favor, introduzca el minuto de llegada:");
			minLlegada = teclado.nextInt();
		}
			
		
		//¡¡OJO!! La variable "difDia" ha sido calculada durante el "while" que valoraba el cambio de mes (linea 39-57) y, en el caso en el que no entrara en la esctructura, el calculo se realizaba en la linea 37.
		if(difDia == 0) {
			difHora = horaLlegada - horaSalida;
		}else {
			if (horaLlegada >= horaSalida) {
				difHora = (difDia*24) + horaLlegada - horaSalida;
			}else {
				difDia = difDia - 1;
				difHora = (difDia*24) + (horaLlegada+24) - horaSalida;
			}
		}
			
		if (minLlegada >= minSalida) {
			difMin = minLlegada - minSalida;
		}else {
			difMin = ((minLlegada+60) - minSalida);
			difHora = difHora - 1;
		}
		
		System.out.println("En total, el viaje ha tomado "+difHora+ " horas y "+difMin+" minutos.");
		
		teclado.close();
	}

}
