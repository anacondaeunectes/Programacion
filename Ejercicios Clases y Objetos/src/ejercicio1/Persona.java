package ejercicio1;
//Ejercicio 1 "Boletin POO"
public class Persona {
	private String nombre;
	private String apellido;
	private String nif;
	
	public Persona(String n, String a, String d){
		nombre=n;
		apellido=a;
		nif=d;
	}
	//¿Son necesarios mas constructores?.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre=n;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String a) {
		apellido=a;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String d) {
		nif=d;
	}
}
