package ej8_Alumno;

import ej7_Asignatura.Asignatura;

public class Alumno extends Asignatura{

	private String nombre;
	private int edad;
	private Asignatura Lengua;
	
	public Alumno(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
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

}
	

