package main;

import ej5_Empleado.Empleado;

public class main_Empleado {

	public static void main(String[] args) {
		Empleado p1 = new Empleado("ss");
		p1.setSueldoBase(1000);
		p1.setPagoHorasExtras(260);
		p1.setTipoIRPF(23);
		System.out.println(p1.getSueldoBruto());
	}

}
