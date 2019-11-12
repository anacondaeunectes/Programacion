package ej1_DVD;

public class Datos {
	public String descripcion;
	private boolean esThriller;
	private boolean tieneResumen;
	private int duracion;
	
	public Datos(String descripcion, boolean thriller, boolean resumen, int duracion) {
		this.descripcion = descripcion;
		this.esThriller = thriller;
		this.tieneResumen = resumen;
		this.duracion = duracion;
	}
	public String muestraDVDCine() {
		return descripcion; 
				}
	public String esThriller() {
		if (esThriller == true) {
			return "Si, es un thriller.";
		}else {
			return "No, no es un thriller.";
		}
	}
	public String tieneResumen() {
		if (tieneResumen == true) {
			return "Si, tiene resumen.";
		}else {
			return "No, no tiene resumen.";
		}
	}
	public String muestraDuracion() {
		return "La duracion es de "+duracion+" minutos.";
	}
}


