package main;

import ej6_Persona.*;

public class Main_Ej6_Persona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		Empleado e1=new Empleado();
		
		p1.setDatosPersonales("Kevin", 35);
		p1.printDatosPersonales();
		
		e1.setDatosPersonales("Guillermo", 46);
		e1.setSueldo(1500);
		e1.printDatosPersonales();
		e1.printSueldo();
	}

}
