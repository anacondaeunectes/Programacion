package reto_1;

public class Tipo_de_Contador {
	
	private int numero;
	private Contador g;
	
	Tipo_de_Contador(int x){
		this.numero=x;
//		this.g.getContador()=getCont().setContador(0);
	}
	
	public void sumarAlContador() {
		g.SumarAlContador();
	}
	
	public Contador getCont() {
		return g;
	}
	
	public int getNumero() {
		return numero;
	}
}
