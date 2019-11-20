package reto_1;

import java.util.ArrayList;

public class Default {

	public static void main(String[] args) {
		
//		!!OJO!! NO SE CONTEMPLA EN ESTE ALGORITMO QUE HAYA ESPACIOS ENTRE PALABRAS EN EL TITULO
		
		
//		PASO 1
		
//		Variable de tipo String que albergaria el titulo original del libro
		String titulo = "casa";		
		
//		Array que va a albergar cada uno de los caracteres del titulo del libro
		char ArrayTitulo[];		
//		Declaracion del array
		ArrayTitulo = new char[titulo.length()];	
		
//		Bucle que va a insertar cada caracter del titulo en una casilla del array
		for (int i = 0; i < titulo.length(); i++) {		
			ArrayTitulo[i] = titulo.charAt(i);
		}
		
//		OJO, que este metodo devulve la posici�n de ese caracter en ASCII
//		System.out.println(titulo.codePointAt(2));
		
		
		String abcde = "abcdefghijklmn�opqrstuvwxyz";
		System.out.println(abcde.indexOf(ArrayTitulo[2]));
		
		ArrayList<Character> Repeticiones = new ArrayList<Character>();
		
		int numRepeticiones;
		int cont = 0;
		
//		Bucle for para calcular la distancia entre un caracter y el siguiente con respecto al indice del string "abcde" teniendo en cuenta las excepciones. El bucle <<do while>> agrega a 
//		una ArrayList cada caracter del titulo el numero de veces la distacia que se ha calculado antes.
		for (int i = 0; i < ArrayTitulo.length; i++) {
			//OJO, POSIBLE PROBLEMA SI EL TITULO CONTIENE DOS LETRAS SEGUIDAD IGUALES como "rr" por ejemplo
			if (i < (ArrayTitulo.length - 1)) {
				if((abcde.indexOf(ArrayTitulo[i+1]) - abcde.indexOf(ArrayTitulo[i]))>=0) {			
					numRepeticiones = abcde.indexOf(ArrayTitulo[i+1]) - abcde.indexOf(ArrayTitulo[i]);
				}else {
					numRepeticiones = abcde.indexOf(ArrayTitulo[i]) - abcde.indexOf(ArrayTitulo[i+1]);
				}
			}else {
				if((abcde.indexOf(ArrayTitulo[i]) - abcde.indexOf(ArrayTitulo[0]))>=0) {			
					numRepeticiones = abcde.indexOf(ArrayTitulo[i]) - abcde.indexOf(ArrayTitulo[0]);
				}else {
					numRepeticiones = abcde.indexOf(ArrayTitulo[0]) - abcde.indexOf(ArrayTitulo[i]);
				}
				
			}	
			while(cont < numRepeticiones) {
				Repeticiones.add(ArrayTitulo[i]);
				cont++;
			}
			cont = 0;
		}
		
		System.out.println(Repeticiones);

//		PASO 2
		
		
//		Convierto el ArrayList a un array de tipo char
		char[] ArrayRepeticiones = new char[Repeticiones.size()];		
		for(int i = 0; i < Repeticiones.size(); i++) {
		    ArrayRepeticiones[i] = Repeticiones.get(i);
		}
		
//		Creo un array de tipo int
		int[] ArrayAscii = new int[ArrayRepeticiones.length];	

//		Introduzco a la vez que hago un cast de char a int(me da el valor ASCII del caracer) cada elemento de un array a otro
		for (int i = 0; i < ArrayRepeticiones.length; i++) {			
			ArrayAscii[i] = (int)ArrayRepeticiones[i];
//			System.out.println(ArrayAscii[i]);
		}
//		PASO 3
		
//		Bucle que suma las cifras que conforman cada int del ArrayAscii y sustituye el valor en el Array
		for (int i = 0; i < ArrayAscii.length; i++) {					
			ArrayAscii[i] = (ArrayAscii[i]%10) +   ((ArrayAscii[i]/10)%10) + (((ArrayAscii[i]/10)/10)%10);
//			System.out.println(ArrayAscii[i]);
		}
		
//		PASO 4
		
//		Aplico mod 10 a cada elemento del ArrayAscii
		for (int i = 0; i < ArrayAscii.length; i++) {					
			ArrayAscii[i] = ArrayAscii[i]%10 ;
//			System.out.println(ArrayAscii[i]);
		}

//		PASO 5	
		ArrayList <Integer> Reduccion = new ArrayList<Integer>();
		
//		for (int i = 0; i < ArrayAscii.length; i++) {
//			int contad=0;
//			for (int j = 0; j < ArrayAscii.length; j++) {
//				if(i < (ArrayAscii.length-1)) {
//					if (ArrayAscii[i] == ArrayAscii[j] && contad < ArrayAscii[i] && ArrayAscii[i] == ArrayAscii[i-1]){
//						contad++;
//						Reduccion.add(i);
//					}
//				}else {
//					
//				}
//			}
//				
//		}
		
		ArrayList <Tipo_de_Contador> tipos = new ArrayList<Tipo_de_Contador>();
		
//		for (int i = 0; i < ArrayAscii.length; i++) {
//			if (i == 0) {
//				Reduccion.add(i);
//				tipos.add(new Tipo_de_Contador(ArrayAscii[i]));
//				tipos.get(0).sumarAlContador();
//			}else {
//				if (ArrayAscii[i] == ArrayAscii[i-1]) {
//					b.sumarAlContador();
//					if (b.getCont().getContador() < ArrayAscii[i]) {
//						Reduccion.add(i);
//					}
//				}
//			}
//		}
//		
//		for (int i = 0; i < ArrayAscii.length; i++) {
//			if (i == 0) {
//				Reduccion.add(i);
//				tipos.add(new Tipo_de_Contador(ArrayAscii[i]));
//				tipos.get(0).sumarAlContador();
//			}else {
//				if (ArrayAscii[i] == ArrayAscii[i-1]) {
//					b.sumarAlContador();
//					if (b.getCont().getContador() < ArrayAscii[i]) {
//						Reduccion.add(i);
//					}
//				}
//			}
//		}
		
		
		for (int i = 0; i < ArrayAscii.length - 1; i++) { 		//OJO, REVISAR SI ES LOGICA EL "-1 "DEL "HASTA..."
			if (i == 0) {
				Reduccion.add(i);
				tipos.add(new Tipo_de_Contador(ArrayAscii[i]));
				tipos.get(0).sumarAlContador();
				System.out.println("Tipo("+tipos.get(i).getNumero()+"). Contador va por: "+tipos.get(i).getCont().getContador());
			}else {
				boolean relleno=false;
				for (int j = 0; j < tipos.size() - 1; j++) {				//OJO, REVISAR SI ES LOGICA EL "-1 "DEL "HASTA..."
					if (ArrayAscii[i] == tipos.get(j).getNumero()) {		//va a ver si es de un tipo de contador
						relleno=true;
						if (ArrayAscii[i] == ArrayAscii[i-1]) {				//si es igual al anterior elemento del ArrayAscii, lo guarda en el mismo tipo de contador, sino crea uno nuevo
							tipos.get(j).sumarAlContador();
						}else {
							tipos.add(new Tipo_de_Contador(ArrayAscii[i]));
							tipos.get(j+1).sumarAlContador();
						}
					}
				}if (relleno == false) {
					tipos.add(new Tipo_de_Contador(ArrayAscii[i]));
					tipos.get(i).sumarAlContador();
				}
				System.out.println("Tipo("+tipos.get(i).getNumero()+"). Contador va por: "+tipos.get(i).getCont().getContador());
			}
			
		}
		for (int i = 0; i < tipos.size(); i++) {
			int contad=0;
			do {
				contad++;
				Reduccion.add(tipos.get(i).getNumero());
			}while(contad<=tipos.get(i).getCont().getContador());
			System.out.println(Reduccion.get(i));
		}
		
		
	}
}
