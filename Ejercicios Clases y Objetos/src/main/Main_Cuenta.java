package main;

import ejercicio6.Cuenta;

public class Main_Cuenta {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta(12345678, 2000, 2);
		Cuenta c2=new Cuenta(12345678, 2000, 2);
		System.out.println(c1.getSaldo());
		c1.ingresar(200);
		System.out.println(c1.getSaldo());
		c1.retirar(100);
		System.out.println(c1.getSaldo());
		System.out.println(c1.getNumCuenta());
		System.out.println(c2.getNumCuenta());
		System.out.println(c1.datosCuenta());
	}

}
