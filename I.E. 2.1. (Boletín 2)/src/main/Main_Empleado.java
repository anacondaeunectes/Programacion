package main;

import ej5_Empleado_FALTA_APLICAR_CLONE.Empleado;

public class Main_Empleado {

	public static void main(String[] args) {
		Empleado p1 = new Empleado("ss");
		p1.setSueldoBase(1000);
		p1.setPagoHorasExtras(10);
		p1.setHorasExtrasMes(8);
		p1.setCasado(true);
		p1.setNumHijos(2);
		p1.setTipoIRPF(23);
		p1.getDescuentos();
		System.out.println(p1.getComplemento());
		System.out.println(p1.printAll());
	}

}
/*80.0
0.0
NIF: ss
Estado civil: Casado y tiene 2 hijos.
Su sueldo base es de: 1000.0
Tiene un complememento por las horas extras realizadas al mes de: 80.0
El sueldo bruto es de: 1080.0
Su tipo de IRPF (teniendo en cuenta descuentos) es de: 19.0
Tiene una retencion por el tipo de IRPF sobre el sueldo bruto de: 205.2
Su suelto neto queda, por tanto, en: 874.8*/