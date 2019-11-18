package prueba_Inicial;

public class A {

	public static void main(String[] args) {
		int edades[] = new int[4]; 
		edades[0]=3;
		edades[1]=5;
		edades[2]=7;
		edades[3]=9;
		
		System.out.println("El primero es: "+edades[1]);
		for (int i = 0; i < edades.length; i++) {
			System.out.println((i+1)+": "+edades[i]);
		}
		
		Persona persona[][] = new Persona[3][2];
		persona[0][0] = new Persona("Pepe");
		persona[0][1] = new Persona("Ana");
		persona[1][0] = new Persona("Eduardo");
		persona[1][1] = new Persona("Guille");
		persona[2][0] = new Persona("Reyes");
		persona[2][1] = new Persona("David");
		
		for (int i = 0; i < persona.length; i++) {
			for (int j = 0; j < persona[j].length; j++) {
				System.out.println("Renglon("+i+"):Columna("+j+"): "+persona[i][j].getNombre());
			}
			
		}
	}

}
