package main;

import ej5_Empleado.Empleado;

public class Main_Empleado {

	public static void main(String[] args) {
		Empleado p1 = new Empleado("ss");
		p1.setSueldoBase(1000);
		p1.setPagoHorasExtras(10);
		p1.setHorasExtrasMes(8);
		p1.setTipoIRPF(23);
		p1.setCasado(true);
		p1.setNumHijos(2);
		System.out.println(p1.getComplemento());
		System.out.println(p1.printAll());
	}

}
