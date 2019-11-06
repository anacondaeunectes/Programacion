package ejercicio6;

public class Cuenta {
	private long numCuenta;
	private static long incremento;
	private long dni;
	private double saldoActual;
	private double interesAnual;
	
	/*Para recoger el numCuenta vamos a definir un atributo incremento como static para que sea 
	una variable global y no inicialize cada vez la variable. Como en los constructores cada vez que se crea un 
	objeto incrementa el numCuenta, si asigno cada vez el atributo static "incremento" al numero de cuenta voy a 
	conseguir que cada objeto obtenga un numero de cuenta consecutivo pero distinto(1,2,3,4,...) */
	
	public Cuenta() {
		incremento++;
		numCuenta=incremento;
	} 
	public Cuenta(long dni, double saldo, double interes) {
		incremento++;
		numCuenta=incremento;
		this.dni=dni;
		this.saldoActual=saldo;
		this.interesAnual=interes;
	}
	public long getNumCuenta() {
		return numCuenta;
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
		return "el numero de cuenta es: "+numCuenta+". El dni es: "+dni+". El saldo actual es: "+saldoActual+". El interes es: "+interesAnual+".";		
	}
}
