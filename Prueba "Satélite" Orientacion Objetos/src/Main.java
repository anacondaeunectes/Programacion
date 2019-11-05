
public class Main {

	public static void main(String[] args) {

		Satelite s1= new Satelite();
		Satelite s2= new Satelite (3, 4, 8);
		
		s1.printPosicion();
		//borrar
		s2.setPosicion(30, 40, 80);
		s2.printPosicion();
		
		s2.meridiano = 20;	//puedo acceder debido a que, en la Clase "Satelite", este atributo está declarado como public. 
		
		s2.paralelo = 30;	//no puedo acceder debido a que, en la Clase "Satelite", este atributo está declarado como private
	}

}
