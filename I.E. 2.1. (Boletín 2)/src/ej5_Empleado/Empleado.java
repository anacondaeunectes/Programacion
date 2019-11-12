package ej5_Empleado;

public class Empleado {
	private String NIF;
	private double sueldo_base;
	private double pago_horas_extras;
	private double horas_extras_mes;
	private double tipo_IRPF;
	private boolean casado;
	private int num_hijos;
	
	
	public Empleado(String dni) {
		this.NIF=dni;
	}
	//Además, se ha de crear un constructor vacio para el caso en el que no se introduzca dni. 
	public Empleado() {
	}
	
}
