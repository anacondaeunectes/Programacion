package ejercicio3;

public class Numero {
	private int entero;
		
	public Numero(){
	}
	public Numero(int n) {
		entero=n;
	}
	
	public void aniade(int v) {
		entero=entero+v;
	}
	public void resta(int v) {
		entero=entero-v;
	}
	public int getValor() {
		return entero;
	}
	public int getDoble() {
		entero=entero*2;
		return entero;
	}
	public int getTriple() {
		entero=entero*3;
		return entero;
	}
	public void setNumero(int i) {
		entero=i;
	}
}	
