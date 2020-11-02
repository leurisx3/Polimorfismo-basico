//Creacion de la clase Sonata extencion de la clase Carro
public class Sonata extends Carro {

	//Declarando variables privadas
	private boolean ventanasTintatada = false;
	private boolean camaraTrasera = false;
	
	//Creacion del metodo constructor
	public Sonata(String marca, String modelo, int numeroPuertas, boolean encendio, boolean ventanasTintatada, boolean camaraTrasera) {
		super(marca, modelo, numeroPuertas, encendio);
		this.ventanasTintatada = ventanasTintatada;
		this.camaraTrasera = camaraTrasera;
	}

	//Metodos getters
	public boolean isVentanasTintatada() {
		return ventanasTintatada;
	}
	public boolean isCamaraTrasera() {
		return camaraTrasera;
	}
	
	//Metodos del carro sonata
	public void camaraTraseraEncendia() {
		System.out.println("La camara trasea esta encendida.");
	}
	
	public void camaraTraseraApagada() {
		System.out.println("La camara trasera esta apagada.");
	}
	
	//Metodo para mostrar el modelo del carro	
	public String mostrarModelo() {
		return "Modelo: "+getModelo();
	}
}
