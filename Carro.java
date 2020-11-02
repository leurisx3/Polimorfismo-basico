//Creacion de la superclase carro
public class Carro {
	
	//Declarando variables privadas e inicializandolas
	private String marca = "";
	private String modelo = "";
	private int numeroPuertas = 0;
	private boolean encendio = false;
	
	//Creacion del metodo constructor
	public Carro(String marca, String modelo, int numeroPuertas, boolean encendio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.encendio = encendio;
	}

	//Creacion de metodos getters
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public boolean isEncendio() {
		return encendio;
	}
	
	//Metodos de un carro
	public void encender() {
		System.out.println("El carro esta encendido.");
	}
	public void apagar() {
		System.out.println("El carro esta apagado.");
	}
	
	//Metodo para mostrar el modelo
	public String mostrarModelo() {
		return "Modelo: "+modelo;
	}
}
