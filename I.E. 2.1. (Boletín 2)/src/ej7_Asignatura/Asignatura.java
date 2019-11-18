package ej7_Asignatura;

public class Asignatura {
	private String nombre;
	private double nota;
	
	public Asignatura(String nombre, double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	public void setNota(double nota) {
		 this.nota=nota;
	}
	public double getNota() {
		return nota;
	}
	public String recogidaNotas() {
		if (this.nota>=5) {
			return "Aprobado";
		}else {
			return "Suspenso";
		}
	}
	public String getNombreAsignatura() {
		return nombre;
	}
}
