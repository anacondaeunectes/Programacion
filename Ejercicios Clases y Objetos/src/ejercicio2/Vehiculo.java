package ejercicio2;

public class Vehiculo {
	public String modelo;
	public double potencia;
	public boolean cRuedas;
	String a;
	
	public Vehiculo(String m){
		modelo=m;
	}
	
	public String getPotencia() {
		return modelo;
	}
	
	public void setPotencia(Double p) {
		potencia=p;
	}
	
	public Boolean getCRuedas() {
		return cRuedas;
	}
	
	public void setCReudas(Boolean c) {
		cRuedas=c;
	}		
}
