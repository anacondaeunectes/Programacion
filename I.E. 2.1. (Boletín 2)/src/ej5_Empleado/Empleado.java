package ej5_Empleado;



public class Empleado {
	private String NIF;
	private double sueldoBase, pagoHorasExtras, horasExtrasMes, tipoIRPF;
	private boolean casado;
	private int numHijos;
	
	
	public Empleado(String dni) {
		this.NIF = dni;
	}
	//Ademas, se ha de crear un constructor vacio para el caso en el que no se introduzca dni. 
	public Empleado() {
	}
	public String getNIF() {
		return NIF;
	}
	
	//CREACIÓN SCANNER PARA MÉTODOS
	Scanner entrada = new Scanner(System.in);
	
	//ACCEDENTES Y MUTADORES
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getPagoHorasExtras() {
		return pagoHorasExtras;
	}
	public void setPagoHorasExtras(double pagoHorasExtras) {
		this.pagoHorasExtras = pagoHorasExtras;
	}
	public double getHorasExtrasMes() {
		return horasExtrasMes;
	}
	public void setHorasExtrasMes(double horasExtrasMes) {
		this.horasExtrasMes = horasExtrasMes;
	}
	public double getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		//Con esta estructura de control busco, ademas de controlar que se introduzac un valor correcto, que este sea un porcentaje.
		//A la hora de usar este metodo no se deberia tener en cuenta los posibles descuentos por estar casado o tener hijos.
		if (tipoIRPF < 0 || tipoIRPF > 100) {
			tipoIRPF=tipoIRPF*100;
			if(tipoIRPF<0 || tipoIRPF>100) {
				System.out.println("Ha introducido un tipo de IRPF erroneo. Por favor, introduzca un porcentaje o un valro entre o y 100");
			}else {
				this.tipoIRPF = tipoIRPF;
			}
		}else {
			this.tipoIRPF = tipoIRPF;
		}
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	//OTROS METODOS
	//primer metodo "Cálculo y devolución del complemento correspondiente a las horas extras."
	public double getSueldoBruto() {
		return sueldoBase + pagoHorasExtras;
	}
	public double getRetenciones() {
		if(casado==true) {
			tipoIRPF=tipoIRPF-2;
		} 
		if(numHijos>0) {
			tipoIRPF=tipoIRPF-numHijos;
		}
		return (sueldoBase + pagoHorasExtras) - (tipoIRPF/100);
	}
	public String println() {
		return "NIF: "+dni+"\n"+
	}

	
	
	
		
}
