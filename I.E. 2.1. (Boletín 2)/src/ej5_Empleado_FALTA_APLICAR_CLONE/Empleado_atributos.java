package ej5_Empleado_FALTA_APLICAR_CLONE;

public class Empleado_atributos {
	private String NIF;
	private double sueldoBase, pagoHorasExtras, horasExtrasMes, tipoIRPF, complemento, sueldoBruto;
	private boolean casado;
	private int numHijos;
	
	
	public Empleado_atributos(String dni) {
		this.NIF = dni;
	}
	//Ademas, se ha de crear un constructor vacio para el caso en el que no se introduzca dni. 
	public Empleado_atributos() {
	}
	public String getNIF() {
		return NIF;
	}
	
	//CREACION SCANNER PARA METODOS
	
	//ACCEDENTES Y MUTADORES BASICOS
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
	public String isCasado() {
		if (casado == true) {
			return "Casado";
		}else {
			return "No casado";
		}
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public String getNumHijos() {
		return "tiene "+numHijos+" hijos.";
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	//OTROS METODOS
	public double getComplemento() {
		complemento=pagoHorasExtras*horasExtrasMes;
		return complemento;
	}
	public double getSueldoBruto() {
		sueldoBruto=sueldoBase + complemento;
		return sueldoBruto;
	}
	public void descuentoIRPF() {
	if(casado == true) {
			tipoIRPF = tipoIRPF - 2;
		} 
		if(numHijos > 0) {
			tipoIRPF = tipoIRPF - numHijos;
		}
	}	
	public double getRetenciones() {	
		return (sueldoBruto * tipoIRPF/100);
	}
	public String println() {
		return "NIF: "+NIF+"\n"+"Estado civil: "+isCasado()+" y "+getNumHijos();
	}
	public String printAll() {
		return "NIF: "+NIF+"\n"+"Estado civil: "+isCasado()+" y "+getNumHijos()+"\n"+"Su sueldo base es de: "+getSueldoBase()+
				"\n"+"Tiene un complememento por las horas extras realizadas al mes de: "+getComplemento()+"\n"+
				"El sueldo bruto es de: "+getSueldoBruto()+"\n"+"Su tipo de IRPF (teniendo en cuenta descuentos) es de: "
				+getTipoIRPF()+"\n"+"Tiene una retencion por el tipo de IRPF sobre el sueldo bruto de: "
				+getRetenciones()+"\n"+"Su suelto neto queda, por tanto, en: "+(getSueldoBruto()-getRetenciones());
	}
}
