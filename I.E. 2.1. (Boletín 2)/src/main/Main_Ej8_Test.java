package main;

import ej8_Alumno.Alumno;

public class Main_Ej8_Test {

	public static void main(String[] args) {
		Alumno alumno1=new Alumno("Guillermo", 15, "Lengua", 8.5);
		Alumno alumno2=new Alumno("Matias", 16, "Matematicas", 7);
		Alumno alumno3=new Alumno("Miguel", 12, "Educacion Fisica", 6);
		
		System.out.println(alumno1.getDatosAlumnos());
		
		//De esta forma accedo a cambiar la nota del objeto al que se ha asignado al atributo "asignatura" del 
		//objeto "alumno1"
		alumno1.getAsignatura().setNota(3);		
		
		System.out.println(alumno1.getDatosAlumnos());
		
		
	}

}
