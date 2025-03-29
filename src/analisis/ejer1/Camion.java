package analisis.ejer1;

public class Camion extends Vehiculo{

	private double pesoMaximo;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color, matricula);
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		this.pesoMaximo = pesoMaximo;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
}
