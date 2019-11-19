package main;

import ej8_Alumno.Alumno;

public class Main_Ej8_Test {

	public static void main(String[] args) {
		Alumno al1=new Alumno("Guillermo", 15, "Lengua", 8.5);
		Alumno al2=new Alumno("Matias", 16, "Matematicas", 7);
		Alumno al3=new Alumno("Miguel", 12, "Educacion Fisica", 6);
		
		System.out.println(al1.getDatosAlumnos());
		
		al1.getAsignatura().setNota(3);
		
		System.out.println(al1.getDatosAlumnos());
		
		
	}

}
