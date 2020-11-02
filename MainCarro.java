//Creancion de la clase main carro
public class MainCarro {

	//Metodo main aqui inicial el programa y luego va llamando metodos de otras clases
	public static void main(String[] args) {
		
		//Arreglo de 4 espacios
		Carro misCarros[] = new Carro[4];
		
		//Dandole datos a los arreglos.
		misCarros[0] = new Carro("Audi", "A7", 4, true);
		misCarros[1] = new Sonata("Sonata", "Hyundai", 4, false, true, true);
		misCarros[2] = new Ford("Ford", "Focus", 4, false, 200, "Rojo");
		misCarros[3] = new Toyota("Toyota", "Camry", 4, false, true, true);
		
		//Mostrando modelos de los carros.
		System.out.println("Modelo Audi: "+misCarros[0].getModelo()+
				"\nModelo Sonata: "+misCarros[1].getModelo()+
				"\nModelo Ford: "+misCarros[2].getModelo()+
				"\nModelo Toyota: "+misCarros[3].getModelo());
	}

}
