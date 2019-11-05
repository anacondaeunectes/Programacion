package Ejercicio6;

public class Cuenta {
	private long numCuenta;
	private long dni;
	private double saldoActual;
	private double interesAnual;
	
	public Cuenta() {
	} 
	public Cuenta(long dni, double saldo, double interes) {
		this.dni=dni;
		this.saldoActual=saldo;
		this.interesAnual=interes;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long d) {
		dni=d;
	}
	public double getSaldo() {
		return saldoActual;
	}
	public void setSaldo(double s) {
		saldoActual=s;
	}
	public double getInteres() {
		return interesAnual;
	}
	public void setInteres(double i) {
		interesAnual=i;
	}
	public void actualizarSaldo() {
		saldoActual=saldoActual*(interesAnual/365);
	}
	public void ingresar(double in) {	//¿Por qué el parámetro no tiene que estar en double?
		saldoActual=saldoActual+in;
	}
	public void retirar(double r) {
		if (saldoActual>=r) {
			saldoActual=saldoActual-r;
		}	
	}
	public String datosCuenta() {
		return "numCuenta";		
	}
}
