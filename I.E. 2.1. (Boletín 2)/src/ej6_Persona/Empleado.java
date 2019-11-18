package ej6_Persona;

public class Empleado extends Persona {
	private double sueldo;
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	public void printSueldo() {
		System.out.println("Sueldo: "+sueldo);
	}
}
