package ej8_Alumno;

import ej7_Asignatura.Asignatura;

public class Alumno {

	private String nombre;
	private int edad;
	private Asignatura asignatura;
	
	public Alumno(String nombre, int edad, String nombreAsignatura, double nota) {
		this.nombre=nombre;
		this.edad=edad;
		Asignatura a1 = new Asignatura(nombreAsignatura, nota);
		this.asignatura=a1;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	} 
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	
	public String getDatosAlumnos() {
		return "Nombre: "+getNombre()+"\n"+
				"Edad: "+getEdad()+"\n"+
				"Calificacion por asignatura: "+"\n"+"\t"+
				asignatura.getNombreAsignatura()+": "+asignatura.getNota()+". "+asignatura.recogidaNotas();
	}
}
	

