//Creacion de la clase Toyota extencion de la clase Carro
public class Toyota extends Carro {

	//Declarando variables privadas
	private boolean espacioso = true;
	private boolean ahorraCombustible = true;
	
	//Creacion del metodo constructor
	public Toyota(String marca, String modelo, int numeroPuertas, boolean encendio, boolean espacioso, boolean ahorraCombustible) {
		super(marca, modelo, numeroPuertas, encendio);
		this.espacioso = espacioso;
		this.ahorraCombustible = ahorraCombustible;
	}

	//Metodos getters
	public boolean isEspacioso() {
		return espacioso;
	}
	public boolean isAhorraCombustible() {
		return ahorraCombustible;
	}
	
	public void encenderModoAhorraCombustible() {
		System.out.println("Modo ahorra combustible esta encendido.");
	}
	
	public void apagarModoAhorraCombustible() {
		System.out.println("Modo ahorra combustible esta apagado.");
	}
	
	public String mostrarModelo() {
		return "Modelo: "+getModelo();
	}
}
