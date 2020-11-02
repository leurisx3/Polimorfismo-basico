//Creacion de la clase Ford extencion de la clase Carro
public class Ford extends Carro {

	//Declarando variables privadas
	private int cilindros = 0;
	private String color = "";
	
	//Creacion del metodo constructor
	public Ford(String marca, String modelo, int numeroPuertas, boolean encendio, int cilindros, String color) {
		super(marca, modelo, numeroPuertas, encendio);
		this.cilindros = cilindros;
		this.color = color;
	}

	//Metodos getters
	public int getCilindros() {
		return cilindros;
	}
	public String getColor() {
		return color;
	}
	
	//Metodo del carro ford
	public void cambiarColor() {
		System.out.println("El color ha sido cambiado.");
	}
	
	//Metodo para mostrar el modelo del carro
	public String mostrarModelo() {
		return "Modelo: "+getModelo();
	}
	
}
	