package ej6_Persona;

public class Persona {
	private String nombre;
	private int edad;
 	
	public void setDatosPersonales(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	public void printDatosPersonales() {
		System.out.println("Nombre: "+nombre+"\n"+"Edad: "+edad);
	}
}
