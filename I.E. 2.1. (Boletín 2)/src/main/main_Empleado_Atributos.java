package main;

import ej5_Empleado.Empleado_atributos;

public class main_Empleado_Atributos {

	public static void main(String[] args) {
		Empleado_atributos p1 = new Empleado_atributos("ss");
		p1.setSueldoBase(1000);
		p1.setPagoHorasExtras(10);
		p1.setHorasExtrasMes(8);
		p1.setTipoIRPF(23);
		p1.setCasado(true);
		p1.setNumHijos(2);
		p1.descuentoIRPF();
		System.out.println(p1.getComplemento());
		System.out.println(p1.getRetenciones());
		System.out.println(p1.printAll());
	}

}
